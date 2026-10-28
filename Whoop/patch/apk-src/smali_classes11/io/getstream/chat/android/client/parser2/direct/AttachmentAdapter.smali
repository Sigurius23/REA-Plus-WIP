.class public final Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/models/Attachment;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/models/Attachment;",
        "<init>",
        "()V",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Attachment;",
        "Lqx/c0;",
        "p0",
        "p1",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/models/Attachment;)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Attachment;
    .locals 27

    move-object/from16 v0, p1

    const-string v1, "reader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v1

    sget-object v2, Lqx/w;->I:Lqx/w;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v3

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v1, 0x0

    move v13, v1

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v14, v12

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    .line 4
    :goto_0
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    .line 5
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_13

    .line 6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v4, "original_width"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_1

    .line 7
    :cond_1
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableInt(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Integer;

    move-result-object v21

    goto :goto_0

    .line 8
    :sswitch_1
    const-string v4, "thumb_url"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_1

    .line 9
    :cond_2
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 10
    :sswitch_2
    const-string v4, "asset_url"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_1

    .line 11
    :cond_3
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    .line 12
    :sswitch_3
    const-string v4, "fallback"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_1

    .line 13
    :cond_4
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v19

    goto :goto_0

    .line 14
    :sswitch_4
    const-string v4, "author_name"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_1

    .line 15
    :cond_5
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 16
    :sswitch_5
    const-string v4, "author_link"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_1

    .line 17
    :cond_6
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 18
    :sswitch_6
    const-string v4, "title"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_1

    .line 19
    :cond_7
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v14

    goto/16 :goto_0

    .line 20
    :sswitch_7
    const-string v4, "image"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_1

    .line 21
    :cond_8
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v17

    goto/16 :goto_0

    .line 22
    :sswitch_8
    const-string v4, "type"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_1

    .line 23
    :cond_9
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v16

    goto/16 :goto_0

    .line 24
    :sswitch_9
    const-string v4, "text"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto/16 :goto_1

    .line 25
    :cond_a
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v15

    goto/16 :goto_0

    .line 26
    :sswitch_a
    const-string v4, "name"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_1

    .line 27
    :cond_b
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v18

    goto/16 :goto_0

    .line 28
    :sswitch_b
    const-string v4, "mime_type"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_1

    .line 29
    :cond_c
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v12

    goto/16 :goto_0

    .line 30
    :sswitch_c
    const-string v4, "og_scrape_url"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_1

    .line 31
    :cond_d
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v11

    goto/16 :goto_0

    .line 32
    :sswitch_d
    const-string v4, "original_height"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_1

    .line 33
    :cond_e
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableInt(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Integer;

    move-result-object v20

    goto/16 :goto_0

    .line 34
    :sswitch_e
    const-string v4, "image_url"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto :goto_1

    .line 35
    :cond_f
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_0

    .line 36
    :sswitch_f
    const-string v4, "file_size"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    goto :goto_1

    .line 37
    :cond_10
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableInt(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move v13, v2

    goto/16 :goto_0

    :cond_11
    move v13, v1

    goto/16 :goto_0

    .line 38
    :sswitch_10
    const-string v4, "title_link"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto :goto_1

    .line 39
    :cond_12
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    .line 40
    :cond_13
    :goto_1
    sget-object v4, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v2, v0, v3}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->accumulateExtraData(Ljava/lang/String;Lcom/squareup/moshi/JsonReader;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    goto/16 :goto_0

    .line 41
    :cond_14
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->endObject()V

    if-eqz v3, :cond_15

    .line 42
    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    :goto_2
    move-object/from16 v24, v0

    goto :goto_3

    :cond_15
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_2

    .line 43
    :goto_3
    new-instance v4, Lio/getstream/chat/android/models/Attachment;

    const/high16 v25, 0x60000

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v4 .. v26}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :sswitch_data_0
    .sparse-switch
        -0x69b7027f -> :sswitch_10
        -0x4e754f1c -> :sswitch_f
        -0x34528775 -> :sswitch_e
        -0x25f078ab -> :sswitch_d
        -0x160621d5 -> :sswitch_c
        -0xbaf5b9b -> :sswitch_b
        0x337a8b -> :sswitch_a
        0x36452d -> :sswitch_9
        0x368f3a -> :sswitch_8
        0x5faa95b -> :sswitch_7
        0x6942258 -> :sswitch_6
        0x2a7e862e -> :sswitch_5
        0x2a7f50bf -> :sswitch_4
        0x2d5fa6e2 -> :sswitch_3
        0x4e6ae7a0 -> :sswitch_2
        0x4f47cb86 -> :sswitch_1
        0x7338b9d8 -> :sswitch_0
    .end sparse-switch
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Attachment;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/models/Attachment;)V
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
    check-cast p2, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/models/Attachment;)V

    const/4 p1, 0x0

    throw p1
.end method
