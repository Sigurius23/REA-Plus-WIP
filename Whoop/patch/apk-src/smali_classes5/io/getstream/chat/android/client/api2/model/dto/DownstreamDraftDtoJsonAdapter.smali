.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;",
        "downstreamDraftMessageDtoAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "stringAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "nullableDownstreamMessageDtoAdapter",
        "nullableStringAdapter",
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
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
            ">;"
        }
    .end annotation
.end field

.field private final downstreamDraftMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
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
    .locals 6

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v0, "parent_message"

    const-string v1, "message"

    const-string v2, "channel_cid"

    const-string v3, "quoted_message"

    const-string v4, "parent_id"

    filled-new-array {v1, v2, v3, v4, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->options:Lqx/v;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    sget-object v5, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p1, v0, v5, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->downstreamDraftMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Ljava/lang/String;

    invoke-virtual {p1, v0, v5, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-virtual {p1, v1, v5, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p1, v0, v5, v4}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v2, 0x0

    const/4 v3, -0x1

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move v2, v3

    .line 3
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v9

    const-string v10, "message"

    const-string v11, "channel_cid"

    if-eqz v9, :cond_8

    .line 4
    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v9}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v9

    if-eq v9, v3, :cond_7

    if-eqz v9, :cond_5

    const/4 v10, 0x1

    if-eq v9, v10, :cond_3

    const/4 v10, 0x2

    if-eq v9, v10, :cond_2

    const/4 v10, 0x3

    if-eq v9, v10, :cond_1

    const/4 v10, 0x4

    if-eq v9, v10, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v8, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    and-int/lit8 v2, v2, -0x11

    goto :goto_0

    .line 6
    :cond_1
    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v7, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    and-int/lit8 v2, v2, -0x9

    goto :goto_0

    .line 7
    :cond_2
    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v6, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    and-int/lit8 v2, v2, -0x5

    goto :goto_0

    .line 8
    :cond_3
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_4

    goto :goto_0

    .line 9
    :cond_4
    invoke-static {v11, v11, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 10
    :cond_5
    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->downstreamDraftMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v4, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    if-eqz v4, :cond_6

    goto :goto_0

    .line 11
    :cond_6
    invoke-static {v10, v10, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 12
    :cond_7
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 13
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_0

    .line 14
    :cond_8
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    const/16 v3, -0x1d

    if-ne v2, v3, :cond_b

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    .line 15
    new-instance v4, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    if-eqz v5, :cond_a

    if-eqz v6, :cond_9

    invoke-direct/range {v4 .. v9}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;-><init>(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V

    return-object v4

    .line 16
    :cond_9
    invoke-static {v11, v11, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 17
    :cond_a
    invoke-static {v10, v10, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :cond_b
    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    .line 18
    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v3, :cond_c

    .line 19
    sget-object v17, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 20
    sget-object v18, Lrx/f;->c:Ljava/lang/Class;

    const-class v12, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    const-class v13, Ljava/lang/String;

    const-class v14, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    const-class v15, Ljava/lang/String;

    const-class v16, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    filled-new-array/range {v12 .. v18}, [Ljava/lang/Class;

    move-result-object v3

    .line 21
    const-class v4, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    invoke-virtual {v4, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 22
    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    const-string v4, "also(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_c
    if-eqz v5, :cond_e

    if-eqz v6, :cond_d

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v10, 0x0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v1

    .line 24
    filled-new-array/range {v4 .. v10}, [Ljava/lang/Object;

    move-result-object v1

    .line 25
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 26
    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    return-object v1

    :cond_d
    invoke-static {v11, v11, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 27
    :cond_e
    invoke-static {v10, v10, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1
.end method

.method public bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->downstreamDraftMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->getMessage()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "channel_cid"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->getChannel_cid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "quoted_message"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->getQuoted_message()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "parent_id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->getParent_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "parent_message"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->getParent_message()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x28

    const-string v1, "GeneratedJsonAdapter(DownstreamDraftDto)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
