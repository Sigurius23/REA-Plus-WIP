.class public final Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R2\u0010\u0019\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00170\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
        "mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "mapOfStringNullableDownstreamPushPreferenceDtoAdapter",
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
.field private final mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final mapOfStringNullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final options:Lqx/v;


# direct methods
.method public constructor <init>(Lqx/l0;)V
    .locals 10

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v0, "user_channel_preferences"

    const-string v1, "user_preferences"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v2

    iput-object v2, p0, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->options:Lqx/v;

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/reflect/Type;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v6, 0x1

    const-class v7, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    aput-object v7, v3, v6

    const-class v8, Ljava/util/Map;

    invoke-static {v8, v3}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v3

    new-array v9, v2, [Ljava/lang/reflect/Type;

    aput-object v5, v9, v4

    aput-object v3, v9, v6

    invoke-static {v8, v9}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v3

    sget-object v9, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p1, v3, v9, v0}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v0, v2, [Ljava/lang/reflect/Type;

    aput-object v5, v0, v4

    aput-object v7, v0, v6

    invoke-static {v8, v0}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v0

    invoke-virtual {p1, v0, v9, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->mapOfStringNullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;
    .locals 6

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v0, 0x0

    move-object v1, v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v2

    const-string v3, "user_channel_preferences"

    const-string v4, "user_preferences"

    if-eqz v2, :cond_5

    .line 4
    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->options:Lqx/v;

    invoke-virtual {p1, v2}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v2

    const/4 v5, -0x1

    if-eq v2, v5, :cond_4

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->mapOfStringNullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {v4, v4, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 7
    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {v3, v3, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 9
    :cond_4
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 10
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_0

    .line 11
    :cond_5
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    .line 12
    new-instance v2, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;

    if-eqz v0, :cond_7

    if-eqz v1, :cond_6

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object v2

    .line 13
    :cond_6
    invoke-static {v4, v4, p1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 14
    :cond_7
    invoke-static {v3, v3, p1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "user_channel_preferences"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    .line 5
    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;->getUser_channel_preferences()Ljava/util/Map;

    move-result-object v1

    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "user_preferences"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->mapOfStringNullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;->getUser_preferences()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2d

    const-string v1, "GeneratedJsonAdapter(PushPreferencesResponse)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
