.class public final Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/models/Option;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/models/Option;",
        "<init>",
        "()V",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Option;",
        "Lqx/c0;",
        "p0",
        "p1",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/models/Option;)V",
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
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Option;
    .locals 6

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v2

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    move-object v0, v2

    move-object v1, v0

    .line 4
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v3

    const-string v4, "text"

    const-string v5, "id"

    if-eqz v3, :cond_3

    .line 5
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_2
    sget-object v4, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v3, p1, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->accumulateExtraData(Ljava/lang/String;Lcom/squareup/moshi/JsonReader;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    .line 10
    sget-object v3, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v3, v2, v5, p1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 11
    invoke-virtual {v3, v0, v4, p1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    .line 12
    new-instance p1, Lio/getstream/chat/android/models/Option;

    if-eqz v1, :cond_4

    .line 13
    invoke-static {v1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    :cond_4
    sget-object v1, Lm83/z;->w:Lm83/z;

    .line 14
    :goto_1
    invoke-direct {p1, v2, v0, v1}, Lio/getstream/chat/android/models/Option;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object p1
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Option;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/models/Option;)V
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
    check-cast p2, Lio/getstream/chat/android/models/Option;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/models/Option;)V

    const/4 p1, 0x0

    throw p1
.end method
