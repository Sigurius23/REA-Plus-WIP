.class public final Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/models/Location;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/models/Location;",
        "Ljava/util/Date;",
        "dateAdapter",
        "<init>",
        "(Lcom/squareup/moshi/JsonAdapter;)V",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Location;",
        "Lqx/c0;",
        "p0",
        "p1",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/models/Location;)V",
        "Lcom/squareup/moshi/JsonAdapter;",
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


# direct methods
.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dateAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Location;
    .locals 16

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

    move-object v1, v3

    move-object v5, v1

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v13, v8

    .line 4
    :goto_0
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v2

    const-string v4, "message_id"

    const-string v9, "created_by_device_id"

    const-string v10, "latitude"

    const-string v11, "user_id"

    const-string v12, "longitude"

    const-string v14, "channel_cid"

    if-eqz v2, :cond_9

    .line 5
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_0

    :cond_1
    :goto_1
    move-object/from16 v15, p0

    goto/16 :goto_2

    :sswitch_0
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 7
    :sswitch_1
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    .line 8
    :cond_3
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->nextDouble()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    .line 9
    :sswitch_2
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    .line 10
    :cond_4
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 11
    :sswitch_3
    const-string v4, "end_at"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    move-object/from16 v15, p0

    .line 12
    iget-object v2, v15, Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v0}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/util/Date;

    goto :goto_0

    :sswitch_4
    move-object/from16 v15, p0

    .line 13
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_2

    .line 14
    :cond_6
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->nextDouble()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    goto :goto_0

    :sswitch_5
    move-object/from16 v15, p0

    .line 15
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    .line 16
    :cond_7
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v13

    goto :goto_0

    :sswitch_6
    move-object/from16 v15, p0

    .line 17
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    .line 18
    :cond_8
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_0

    .line 19
    :goto_2
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_0

    :cond_9
    move-object/from16 v15, p0

    .line 20
    invoke-virtual {v0}, Lcom/squareup/moshi/JsonReader;->endObject()V

    .line 21
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v5, v14, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 22
    invoke-virtual {v2, v6, v4, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 23
    invoke-virtual {v2, v7, v11, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 24
    invoke-virtual {v2, v3, v10, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 25
    invoke-virtual {v2, v1, v12, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 26
    invoke-virtual {v2, v13, v9, v0}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 27
    new-instance v4, Lio/getstream/chat/android/models/Location;

    .line 28
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    .line 29
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    .line 30
    invoke-direct/range {v4 .. v13}, Lio/getstream/chat/android/models/Location;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DDLjava/lang/String;)V

    return-object v4

    :sswitch_data_0
    .sparse-switch
        -0x64c65fad -> :sswitch_6
        -0x56d82a4d -> :sswitch_5
        -0x55d45394 -> :sswitch_4
        -0x4d6989e9 -> :sswitch_3
        -0x8c511f1 -> :sswitch_2
        0x83009af -> :sswitch_1
        0x105bf382 -> :sswitch_0
    .end sparse-switch
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Location;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/models/Location;)V
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
    check-cast p2, Lio/getstream/chat/android/models/Location;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/models/Location;)V

    const/4 p1, 0x0

    throw p1
.end method
