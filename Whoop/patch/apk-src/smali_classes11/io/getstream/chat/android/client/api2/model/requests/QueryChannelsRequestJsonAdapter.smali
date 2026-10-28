.class public final Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R$\u0010\u0018\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R.\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u0017\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0019R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0019R\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u0019R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "",
        "nullableMapOfNullableAnyNullableAnyAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "",
        "nullableListOfMapOfStringAnyAdapter",
        "nullableStringAdapter",
        "nullableMapOfStringAnyAdapter",
        "",
        "intAdapter",
        "nullableIntAdapter",
        "",
        "booleanAdapter",
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

.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;",
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

.field private final nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableListOfMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final nullableMapOfNullableAnyNullableAnyAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "**>;>;"
        }
    .end annotation
.end field

.field private final nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;
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


# direct methods
.method public constructor <init>(Lqx/l0;)V
    .locals 13

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v11, "watch"

    const-string v12, "presence"

    const-string v1, "filter_conditions"

    const-string v2, "sort"

    const-string v3, "predefined_filter"

    const-string v4, "filter_values"

    const-string v5, "sort_values"

    const-string v6, "offset"

    const-string v7, "limit"

    const-string v8, "message_limit"

    const-string v9, "member_limit"

    const-string v10, "state"

    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->options:Lqx/v;

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Landroidx/room/c1;->R(Ljava/lang/reflect/Type;)Lrx/e;

    move-result-object v1

    invoke-static {v0}, Landroidx/room/c1;->R(Ljava/lang/reflect/Type;)Lrx/e;

    move-result-object v2

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/reflect/Type;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const-class v2, Ljava/util/Map;

    invoke-static {v2, v4}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v4

    const-string v6, "filter_conditions"

    sget-object v7, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p1, v4, v7, v6}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v4

    iput-object v4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableMapOfNullableAnyNullableAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v4, v3, [Ljava/lang/reflect/Type;

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    aput-object v0, v4, v1

    invoke-static {v2, v4}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v4

    new-array v8, v1, [Ljava/lang/reflect/Type;

    aput-object v4, v8, v5

    const-class v4, Ljava/util/List;

    invoke-static {v4, v8}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v4

    const-string v8, "sort"

    invoke-virtual {p1, v4, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v4

    iput-object v4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableListOfMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v4, "predefined_filter"

    invoke-virtual {p1, v6, v7, v4}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v4

    iput-object v4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v3, v3, [Ljava/lang/reflect/Type;

    aput-object v6, v3, v5

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v0

    const-string v1, "filter_values"

    invoke-virtual {p1, v0, v7, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "offset"

    invoke-virtual {p1, v0, v7, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Ljava/lang/Integer;

    const-string v1, "message_limit"

    invoke-virtual {p1, v0, v7, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v1, "state"

    invoke-virtual {p1, v0, v7, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;
    .locals 39

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

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    .line 3
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v2

    move/from16 v16, v2

    const-string v2, "offset"

    move-object/from16 v17, v4

    const-string v4, "limit"

    move-object/from16 v18, v5

    const-string v5, "state"

    move-object/from16 v19, v6

    const-string v6, "watch"

    move-object/from16 v20, v7

    const-string v7, "presence"

    if-eqz v16, :cond_5

    move-object/from16 v16, v8

    .line 4
    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v8}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    goto :goto_1

    .line 5
    :pswitch_0
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/lang/Boolean;

    if-eqz v15, :cond_0

    :goto_1
    move-object/from16 v8, v16

    :goto_2
    move-object/from16 v4, v17

    :goto_3
    move-object/from16 v5, v18

    :goto_4
    move-object/from16 v6, v19

    :goto_5
    move-object/from16 v7, v20

    goto :goto_0

    :cond_0
    invoke-static {v7, v7, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 6
    :pswitch_1
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/Boolean;

    if-eqz v14, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v6, v6, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 7
    :pswitch_2
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/lang/Boolean;

    if-eqz v13, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v5, v5, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 8
    :pswitch_3
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/Integer;

    goto :goto_1

    .line 9
    :pswitch_4
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/lang/Integer;

    goto :goto_1

    .line 10
    :pswitch_5
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v4, v4, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 11
    :pswitch_6
    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v4, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 12
    :pswitch_7
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/util/Map;

    and-int/lit8 v3, v3, -0x11

    goto :goto_2

    .line 13
    :pswitch_8
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/util/Map;

    and-int/lit8 v3, v3, -0x9

    move-object/from16 v8, v16

    move-object/from16 v4, v17

    move-object/from16 v5, v18

    move-object/from16 v6, v19

    goto/16 :goto_0

    .line 14
    :pswitch_9
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    and-int/lit8 v3, v3, -0x5

    move-object/from16 v8, v16

    move-object/from16 v4, v17

    move-object/from16 v5, v18

    goto/16 :goto_5

    .line 15
    :pswitch_a
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableListOfMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/util/List;

    and-int/lit8 v3, v3, -0x3

    move-object/from16 v8, v16

    move-object/from16 v4, v17

    goto/16 :goto_4

    .line 16
    :pswitch_b
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableMapOfNullableAnyNullableAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/Map;

    and-int/lit8 v3, v3, -0x2

    move-object/from16 v8, v16

    goto/16 :goto_3

    .line 17
    :pswitch_c
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 18
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_1

    :cond_5
    move-object/from16 v16, v8

    .line 19
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    const/16 v8, -0x20

    if-ne v3, v8, :cond_b

    move-object v8, v4

    .line 20
    new-instance v4, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    if-eqz v9, :cond_a

    move-object/from16 v21, v10

    .line 21
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-eqz v21, :cond_9

    move-object/from16 v22, v13

    move-object v13, v12

    move-object v12, v11

    .line 22
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-eqz v22, :cond_8

    move-object/from16 v23, v14

    .line 23
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-eqz v23, :cond_7

    move-object/from16 v24, v15

    .line 24
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    if-eqz v24, :cond_6

    move-object/from16 v8, v16

    .line 25
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    move-object v9, v8

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v20

    .line 26
    invoke-direct/range {v4 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)V

    return-object v4

    .line 27
    :cond_6
    invoke-static {v7, v7, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 28
    :cond_7
    invoke-static {v6, v6, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 29
    :cond_8
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 30
    :cond_9
    invoke-static {v8, v8, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 31
    :cond_a
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :cond_b
    move-object v8, v4

    move-object/from16 v21, v10

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    move-object/from16 v24, v15

    move-object v13, v12

    move-object v12, v11

    .line 32
    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v4, :cond_c

    .line 33
    sget-object v34, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 34
    sget-object v38, Lrx/f;->c:Ljava/lang/Class;

    const-class v25, Ljava/util/Map;

    const-class v26, Ljava/util/List;

    const-class v27, Ljava/lang/String;

    const-class v28, Ljava/util/Map;

    const-class v29, Ljava/util/Map;

    sget-object v30, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v32, Ljava/lang/Integer;

    const-class v33, Ljava/lang/Integer;

    move-object/from16 v31, v30

    move-object/from16 v35, v34

    move-object/from16 v36, v34

    move-object/from16 v37, v30

    filled-new-array/range {v25 .. v38}, [Ljava/lang/Class;

    move-result-object v4

    .line 35
    const-class v10, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    invoke-virtual {v10, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    .line 36
    iput-object v4, v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    const-string v10, "also(...)"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_c
    if-eqz v9, :cond_11

    if-eqz v21, :cond_10

    if-eqz v22, :cond_f

    if-eqz v23, :cond_e

    if-eqz v24, :cond_d

    .line 37
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v5, v17

    const/16 v17, 0x0

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v8, v16

    move-object/from16 v6, v19

    move-object/from16 v7, v20

    move-object/from16 v10, v21

    move-object/from16 v13, v22

    move-object/from16 v14, v23

    move-object/from16 v15, v24

    move-object/from16 v16, v1

    move-object v1, v4

    move-object v4, v5

    move-object/from16 v5, v18

    .line 38
    filled-new-array/range {v4 .. v17}, [Ljava/lang/Object;

    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 40
    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    return-object v1

    :cond_d
    invoke-static {v7, v7, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 41
    :cond_e
    invoke-static {v6, v6, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 42
    :cond_f
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 43
    :cond_10
    invoke-static {v8, v8, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 44
    :cond_11
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "filter_conditions"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableMapOfNullableAnyNullableAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getFilter_conditions()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "sort"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableListOfMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getSort()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "predefined_filter"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getPredefined_filter()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "filter_values"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getFilter_values()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "sort_values"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getSort_values()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    const-string v0, "offset"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getOffset()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 15
    const-string v0, "limit"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 16
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getLimit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 17
    const-string v0, "message_limit"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 18
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getMessage_limit()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 19
    const-string v0, "member_limit"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 20
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getMember_limit()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 21
    const-string v0, "state"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 22
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getState()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 23
    const-string v0, "watch"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 24
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getWatch()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 25
    const-string v0, "presence"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 26
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->getPresence()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 27
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2a

    const-string v1, "GeneratedJsonAdapter(QueryChannelsRequest)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
