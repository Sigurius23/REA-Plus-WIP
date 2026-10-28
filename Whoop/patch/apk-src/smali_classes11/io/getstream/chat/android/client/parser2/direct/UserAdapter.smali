.class public final Lio/getstream/chat/android/client/parser2/direct/UserAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/models/User;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0017R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0017R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/direct/UserAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/models/User;",
        "Lio/getstream/chat/android/models/Device;",
        "deviceAdapter",
        "Lio/getstream/chat/android/PrivacySettings;",
        "privacySettingsAdapter",
        "Ljava/util/Date;",
        "dateAdapter",
        "Lio/getstream/chat/android/models/UserTransformer;",
        "userTransformer",
        "<init>",
        "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/models/UserTransformer;)V",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/User;",
        "Lqx/c0;",
        "p0",
        "p1",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/models/User;)V",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/models/UserTransformer;",
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

.field private final deviceAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final privacySettingsAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/PrivacySettings;",
            ">;"
        }
    .end annotation
.end field

.field private final userTransformer:Lio/getstream/chat/android/models/UserTransformer;


# direct methods
.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/models/UserTransformer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Device;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/PrivacySettings;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;",
            "Lio/getstream/chat/android/models/UserTransformer;",
            ")V"
        }
    .end annotation

    const-string v0, "deviceAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privacySettingsAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userTransformer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->deviceAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p2, p0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->privacySettingsAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p3, p0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p4, p0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->userTransformer:Lio/getstream/chat/android/models/UserTransformer;

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/User;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v2

    sget-object v3, Lqx/w;->I:Lqx/w;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v4

    .line 3
    :cond_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    .line 4
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    move-object v10, v2

    move/from16 v19, v3

    move/from16 v20, v19

    move/from16 v21, v20

    move-object v2, v4

    move-object v3, v2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v27, v18

    move-object/from16 v30, v27

    .line 5
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v22

    move-object/from16 v23, v2

    const-string v2, "banned"

    move-object/from16 v24, v3

    const-string v3, "online"

    move-object/from16 v25, v5

    const-string v5, "id"

    move-object/from16 v26, v8

    const-string v8, "role"

    if-eqz v22, :cond_17

    move-object/from16 v22, v10

    .line 6
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_16

    .line 7
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v28

    sparse-switch v28, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v2, "push_preferences"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_6

    :sswitch_1
    const-string v2, "channel_mutes"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_6

    :sswitch_2
    const-string v2, "devices"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_6

    .line 8
    :cond_1
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    iget-object v3, v0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->deviceAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1, v3}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseList(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;

    move-result-object v8

    move-object/from16 v10, v22

    move-object/from16 v2, v23

    move-object/from16 v3, v24

    move-object/from16 v5, v25

    goto :goto_0

    .line 9
    :sswitch_3
    const-string v2, "last_active"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_6

    .line 10
    :cond_2
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Ljava/util/Date;

    :goto_1
    move-object/from16 v10, v22

    :goto_2
    move-object/from16 v2, v23

    :goto_3
    move-object/from16 v3, v24

    :goto_4
    move-object/from16 v5, v25

    :goto_5
    move-object/from16 v8, v26

    goto :goto_0

    .line 11
    :sswitch_4
    const-string v2, "created_at"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_6

    .line 12
    :cond_3
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/util/Date;

    goto :goto_1

    .line 13
    :sswitch_5
    const-string v2, "deactivated_at"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_6

    .line 14
    :cond_4
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v30, v2

    check-cast v30, Ljava/util/Date;

    goto :goto_1

    .line 15
    :sswitch_6
    const-string v2, "teams"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_6

    .line 16
    :cond_5
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseStringList(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;

    move-result-object v12

    goto :goto_1

    .line 17
    :sswitch_7
    const-string v2, "mutes"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_6

    .line 18
    :cond_6
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_1

    .line 19
    :sswitch_8
    const-string v2, "image"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_6

    .line 20
    :cond_7
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v10, v22

    move-object/from16 v2, v23

    goto :goto_4

    .line 21
    :sswitch_9
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_6

    .line 22
    :cond_8
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 23
    :sswitch_a
    const-string v2, "name"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_6

    .line 24
    :cond_9
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v10, v22

    goto/16 :goto_3

    .line 25
    :sswitch_b
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_6

    .line 26
    :cond_a
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_1

    .line 27
    :sswitch_c
    const-string v2, "updated_at"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_6

    .line 28
    :cond_b
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Ljava/util/Date;

    goto/16 :goto_1

    .line 29
    :sswitch_d
    const-string v2, "avg_response_time"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    .line 30
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableLong(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Long;

    move-result-object v27

    goto/16 :goto_1

    .line 31
    :sswitch_e
    const-string v2, "teams_role"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_6

    .line 32
    :cond_c
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseStringMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;

    move-result-object v14

    goto/16 :goto_1

    .line 33
    :sswitch_f
    const-string v2, "blocked_user_ids"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_6

    .line 34
    :cond_d
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseStringList(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;

    move-result-object v15

    goto/16 :goto_1

    .line 35
    :sswitch_10
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_6

    .line 36
    :cond_e
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_1

    .line 37
    :sswitch_11
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_6

    .line 38
    :cond_f
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    goto/16 :goto_1

    .line 39
    :sswitch_12
    const-string v2, "language"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_6

    .line 40
    :cond_10
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v10, v22

    move-object/from16 v2, v23

    move-object/from16 v3, v24

    goto/16 :goto_5

    .line 41
    :sswitch_13
    const-string v2, "unread_threads"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_6

    .line 42
    :cond_11
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v21

    goto/16 :goto_1

    .line 43
    :sswitch_14
    const-string v2, "privacy_settings"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_6

    .line 44
    :cond_12
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->privacySettingsAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lio/getstream/chat/android/PrivacySettings;

    goto/16 :goto_1

    .line 45
    :sswitch_15
    const-string v2, "unread_channels"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_6

    .line 46
    :cond_13
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v20

    goto/16 :goto_1

    .line 47
    :sswitch_16
    const-string v2, "invisible"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_6

    .line 48
    :cond_14
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableBoolean(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Boolean;

    move-result-object v10

    goto/16 :goto_2

    .line 49
    :sswitch_17
    const-string v2, "total_unread_count"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_6

    .line 50
    :cond_15
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v19

    goto/16 :goto_1

    .line 51
    :cond_16
    :goto_6
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v10, v1, v9}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->accumulateExtraData(Ljava/lang/String;Lcom/squareup/moshi/JsonReader;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v9

    goto/16 :goto_1

    :cond_17
    move-object/from16 v22, v10

    .line 52
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    .line 53
    sget-object v10, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v10, v6, v5, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 54
    invoke-virtual {v10, v7, v8, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 55
    invoke-virtual {v10, v13, v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 56
    invoke-virtual {v10, v4, v3, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 57
    const-string v1, ""

    if-nez v23, :cond_18

    move-object v8, v1

    goto :goto_7

    :cond_18
    move-object/from16 v8, v23

    :goto_7
    if-nez v24, :cond_19

    move-object v3, v1

    goto :goto_8

    :cond_19
    move-object/from16 v3, v24

    :goto_8
    if-nez v25, :cond_1a

    move-object v5, v1

    goto :goto_9

    :cond_1a
    move-object/from16 v5, v25

    .line 58
    :goto_9
    sget-object v1, Lm83/y;->w:Lm83/y;

    if-nez v26, :cond_1b

    move-object/from16 v26, v1

    :cond_1b
    if-nez v12, :cond_1c

    move-object/from16 v23, v1

    goto :goto_a

    :cond_1c
    move-object/from16 v23, v12

    .line 59
    :goto_a
    sget-object v2, Lm83/z;->w:Lm83/z;

    if-nez v14, :cond_1d

    move-object/from16 v24, v2

    goto :goto_b

    :cond_1d
    move-object/from16 v24, v14

    :goto_b
    if-nez v15, :cond_1e

    move-object v15, v1

    :cond_1e
    if-eqz v9, :cond_1f

    .line 60
    invoke-static {v9}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    :cond_1f
    move-object/from16 v29, v2

    move-object v12, v5

    .line 61
    new-instance v5, Lio/getstream/chat/android/models/User;

    .line 62
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/high16 v31, 0x490000

    const/16 v32, 0x0

    move-object/from16 v10, v22

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object v9, v3

    move-object/from16 v14, v26

    move-object/from16 v26, v15

    move v15, v1

    .line 63
    invoke-direct/range {v5 .. v32}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    iget-object v1, v0, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->userTransformer:Lio/getstream/chat/android/models/UserTransformer;

    invoke-interface {v1, v5}, Lio/getstream/chat/android/models/UserTransformer;->transform(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/User;

    move-result-object v1

    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x71a39a66 -> :sswitch_17
        -0x715b4053 -> :sswitch_16
        -0x6fdb69a0 -> :sswitch_15
        -0x67bdbd06 -> :sswitch_14
        -0x66a050e7 -> :sswitch_13
        -0x602d6ca8 -> :sswitch_12
        -0x533a80e2 -> :sswitch_11
        -0x3c5549ad -> :sswitch_10
        -0x3a0f72c9 -> :sswitch_f
        -0x23b22ea1 -> :sswitch_e
        -0x19df92a2 -> :sswitch_d
        -0x119c6dc9 -> :sswitch_c
        0xd1b -> :sswitch_b
        0x337a8b -> :sswitch_a
        0x358076 -> :sswitch_9
        0x5faa95b -> :sswitch_8
        0x636f17a -> :sswitch_7
        0x69209b6 -> :sswitch_6
        0xd255c62 -> :sswitch_5
        0x51a3a8ea -> :sswitch_4
        0x59b4f4cf -> :sswitch_3
        0x5cf8acdd -> :sswitch_2
        0x69bfc33e -> :sswitch_1
        0x6e7c1553 -> :sswitch_0
    .end sparse-switch
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/User;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/models/User;)V
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
    check-cast p2, Lio/getstream/chat/android/models/User;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/direct/UserAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/models/User;)V

    const/4 p1, 0x0

    throw p1
.end method
