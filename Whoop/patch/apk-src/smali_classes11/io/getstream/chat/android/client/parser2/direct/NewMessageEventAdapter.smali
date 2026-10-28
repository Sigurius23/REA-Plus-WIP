.class public final Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/events/NewMessageEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0017R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/events/NewMessageEvent;",
        "Lio/getstream/chat/android/models/Message;",
        "messageAdapter",
        "Lio/getstream/chat/android/models/User;",
        "userAdapter",
        "<init>",
        "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "Ll83/k;",
        "",
        "parseChannelCustom",
        "(Lcom/squareup/moshi/JsonReader;)Ll83/k;",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/events/NewMessageEvent;",
        "Lqx/c0;",
        "p0",
        "p1",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/events/NewMessageEvent;)V",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;",
        "streamDateFormatter",
        "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;",
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
.field private final messageAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private final streamDateFormatter:Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;

.field private final userAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messageAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;->messageAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p2, p0, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-instance p1, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;

    const/4 p2, 0x2

    const/4 v0, 0x0

    const-string v1, "NewMessageEventAdapter"

    const/4 v2, 0x0

    invoke-direct {p1, v1, v2, p2, v0}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;->streamDateFormatter:Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;

    return-void
.end method

.method private final parseChannelCustom(Lcom/squareup/moshi/JsonReader;)Ll83/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonReader;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->y:Lqx/w;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    new-instance p1, Ll83/k;

    invoke-direct {p1, v2, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    move-object v0, v2

    move-object v1, v0

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "name"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    sget-object v5, Lqx/w;->I:Lqx/w;

    if-eqz v4, :cond_2

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    if-ne v0, v5, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    move-object v0, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v4, "image"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v1

    if-ne v1, v5, :cond_3

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    move-object v1, v2

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/events/NewMessageEvent;
    .locals 122

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v2

    const/4 v3, 0x0

    sget-object v4, Lqx/w;->I:Lqx/w;

    if-ne v2, v4, :cond_0

    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v3

    .line 3
    :cond_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v15, v13

    move-object/from16 v16, v15

    move-object/from16 v65, v16

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    .line 4
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v14

    const-string v2, "channel_id"

    const-string v3, "channel_type"

    move-object/from16 v69, v7

    const-string v7, "cid"

    move-object/from16 v19, v13

    const-string v13, "type"

    move/from16 v20, v14

    const-string v14, "user"

    move-object/from16 v21, v15

    const-string v15, "message"

    move-object/from16 v22, v5

    const-string v5, "created_at"

    if-eqz v20, :cond_10

    move-object/from16 v20, v12

    .line 5
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_f

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v23

    sparse-switch v23, :sswitch_data_0

    goto/16 :goto_7

    :sswitch_0
    const-string v2, "channel_message_count"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_7

    .line 6
    :cond_1
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableInt(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Integer;

    move-result-object v65

    :goto_1
    move-object/from16 v13, v19

    :goto_2
    move-object/from16 v12, v20

    :goto_3
    move-object/from16 v15, v21

    :goto_4
    move-object/from16 v5, v22

    :goto_5
    move-object/from16 v7, v69

    :goto_6
    const/4 v3, 0x0

    goto :goto_0

    .line 7
    :sswitch_1
    const-string v2, "channel_member_count"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_7

    .line 8
    :cond_2
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableInt(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Integer;

    move-result-object v13

    goto :goto_2

    .line 9
    :sswitch_2
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_7

    .line 10
    :cond_3
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v2

    if-eq v2, v4, :cond_4

    .line 11
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v8

    .line 12
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;->streamDateFormatter:Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v8}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->parse$stream_chat_android_client_release(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    move-object/from16 v13, v19

    move-object/from16 v12, v20

    move-object/from16 v15, v21

    move-object/from16 v5, v22

    goto :goto_6

    .line 13
    :cond_4
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_1

    .line 14
    :sswitch_3
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_7

    .line 15
    :cond_5
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;->messageAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lio/getstream/chat/android/models/Message;

    move-object/from16 v13, v19

    move-object/from16 v12, v20

    move-object/from16 v15, v21

    goto :goto_5

    .line 16
    :sswitch_4
    const-string v2, "watcher_count"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_7

    .line 17
    :cond_6
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v66

    goto :goto_1

    .line 18
    :sswitch_5
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_7

    .line 19
    :cond_7
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lio/getstream/chat/android/models/User;

    goto :goto_1

    .line 20
    :sswitch_6
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_7

    .line 21
    :cond_8
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_1

    .line 22
    :sswitch_7
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_7

    .line 23
    :cond_9
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_1

    .line 24
    :sswitch_8
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_7

    .line 25
    :cond_a
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v11

    goto/16 :goto_1

    .line 26
    :sswitch_9
    const-string v2, "channel_custom"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_7

    .line 27
    :cond_b
    invoke-direct/range {p0 .. p1}, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;->parseChannelCustom(Lcom/squareup/moshi/JsonReader;)Ll83/k;

    move-result-object v2

    .line 28
    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    .line 29
    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    .line 30
    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    .line 31
    move-object/from16 v16, v2

    check-cast v16, Ljava/lang/String;

    move-object/from16 v13, v19

    move-object/from16 v12, v20

    goto/16 :goto_4

    .line 32
    :sswitch_a
    const-string v2, "unread_channels"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_7

    .line 33
    :cond_c
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v68

    goto/16 :goto_1

    .line 34
    :sswitch_b
    const-string v2, "total_unread_count"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_7

    .line 35
    :cond_d
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v67

    goto/16 :goto_1

    .line 36
    :sswitch_c
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_7

    .line 37
    :cond_e
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v13, v19

    goto/16 :goto_3

    .line 38
    :cond_f
    :goto_7
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_1

    :cond_10
    move-object/from16 v20, v12

    .line 39
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    .line 40
    sget-object v4, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v4, v6, v13, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 41
    invoke-virtual {v4, v8, v5, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    if-eqz v69, :cond_1f

    .line 42
    invoke-virtual {v4, v9, v14, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 43
    invoke-virtual {v4, v10, v7, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 44
    invoke-virtual {v4, v11, v3, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v12, v20

    .line 45
    invoke-virtual {v4, v12, v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v3, v22

    .line 46
    invoke-virtual {v4, v3, v15, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 47
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getChannelInfo()Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_8

    :cond_11
    const/4 v1, 0x0

    .line 48
    :goto_8
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 49
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v70

    if-eqz v70, :cond_12

    .line 50
    invoke-virtual/range {v70 .. v70}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    move v5, v2

    goto :goto_9

    :cond_12
    const/4 v5, 0x0

    :goto_9
    if-eqz v70, :cond_13

    .line 51
    invoke-virtual/range {v70 .. v70}, Lio/getstream/chat/android/models/Message;->getChannelInfo()Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v7

    if-nez v7, :cond_13

    move v7, v2

    goto :goto_a

    :cond_13
    const/4 v7, 0x0

    :goto_a
    if-nez v5, :cond_15

    if-eqz v7, :cond_14

    goto :goto_b

    :cond_14
    const/4 v2, 0x0

    :cond_15
    :goto_b
    if-nez v1, :cond_16

    if-eqz v4, :cond_16

    if-eqz v2, :cond_17

    :cond_16
    move-object v13, v11

    move-object v11, v10

    goto :goto_c

    :cond_17
    move-object v13, v3

    move-object v1, v11

    move-object v11, v10

    goto/16 :goto_15

    .line 52
    :goto_c
    new-instance v10, Lio/getstream/chat/android/models/ChannelInfo;

    if-eqz v19, :cond_18

    .line 53
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v14, v1

    :goto_d
    move-object/from16 v15, v21

    goto :goto_e

    :cond_18
    const/4 v14, 0x0

    goto :goto_d

    .line 54
    :goto_e
    invoke-direct/range {v10 .. v16}, Lio/getstream/chat/android/models/ChannelInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    move-object v1, v13

    .line 55
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getChannelInfo()Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v7

    if-nez v7, :cond_19

    move-object/from16 v43, v10

    goto :goto_f

    :cond_19
    move-object/from16 v43, v7

    :goto_f
    if-nez v4, :cond_1a

    move-object v15, v11

    goto :goto_10

    .line 56
    :cond_1a
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v4

    move-object v15, v4

    :goto_10
    if-eqz v70, :cond_1e

    if-eqz v2, :cond_1d

    if-eqz v5, :cond_1b

    move-object/from16 v72, v11

    goto :goto_11

    .line 57
    :cond_1b
    invoke-virtual/range {v70 .. v70}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v72, v2

    .line 58
    :goto_11
    invoke-virtual/range {v70 .. v70}, Lio/getstream/chat/android/models/Message;->getChannelInfo()Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v2

    if-nez v2, :cond_1c

    move-object/from16 v100, v10

    goto :goto_12

    :cond_1c
    move-object/from16 v100, v2

    :goto_12
    const v120, 0xffff

    const/16 v121, 0x0

    const/16 v71, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    const/16 v118, 0x0

    const v119, -0x20000003

    .line 59
    invoke-static/range {v70 .. v121}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    goto :goto_13

    :cond_1d
    move-object/from16 v2, v70

    :goto_13
    move-object/from16 v44, v2

    goto :goto_14

    :cond_1e
    const/16 v44, 0x0

    :goto_14
    const v63, 0xffff

    const/16 v64, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const v62, -0x60000003

    move-object v13, v3

    .line 60
    invoke-static/range {v13 .. v64}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v5

    move-object v13, v5

    .line 61
    :goto_15
    new-instance v5, Lio/getstream/chat/android/client/events/NewMessageEvent;

    move-object v10, v11

    move-object/from16 v17, v65

    move/from16 v14, v66

    move/from16 v15, v67

    move/from16 v16, v68

    move-object/from16 v7, v69

    move-object v11, v1

    invoke-direct/range {v5 .. v17}, Lio/getstream/chat/android/client/events/NewMessageEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;IIILjava/lang/Integer;)V

    return-object v5

    .line 62
    :cond_1f
    new-instance v2, Lcom/squareup/moshi/JsonDataException;

    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Unparseable \'created_at\' value \'"

    const-string v4, "\' at "

    .line 63
    invoke-static {v3, v8, v4, v1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 64
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 65
    throw v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7315ce29 -> :sswitch_c
        -0x71a39a66 -> :sswitch_b
        -0x6fdb69a0 -> :sswitch_a
        -0x42d80dd3 -> :sswitch_9
        -0x4d58b0a -> :sswitch_8
        0x180be -> :sswitch_7
        0x368f3a -> :sswitch_6
        0x36ebcb -> :sswitch_5
        0x272d50cc -> :sswitch_4
        0x38eb0007 -> :sswitch_3
        0x51a3a8ea -> :sswitch_2
        0x6df6cce6 -> :sswitch_1
        0x7547209b -> :sswitch_0
    .end sparse-switch
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/events/NewMessageEvent;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/client/events/NewMessageEvent;)V
    .locals 0

    const-string p2, "p0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    const-string p2, "Serialization not supported for direct-to-domain path"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/events/NewMessageEvent;)V

    const/4 p1, 0x0

    throw p1
.end method
