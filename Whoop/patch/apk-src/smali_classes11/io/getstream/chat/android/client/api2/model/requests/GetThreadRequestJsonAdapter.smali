.class public final Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "",
        "booleanAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "intAdapter",
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
            "Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;",
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
    .locals 7

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v5, "limit"

    const-string v6, "next"

    const-string v1, "watch"

    const-string v2, "reply_limit"

    const-string v3, "participant_limit"

    const-string v4, "member_limit"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->options:Lqx/v;

    const-string v0, "watch"

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p1, v1, v2, v0}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "reply_limit"

    invoke-virtual {p1, v0, v2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Ljava/lang/String;

    const-string v1, "next"

    invoke-virtual {p1, v0, v2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    .line 3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 4
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v4, 0x0

    const/4 v5, -0x1

    move-object v6, v2

    move-object v7, v3

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object/from16 v17, v4

    .line 5
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 6
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v2}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Ljava/lang/String;

    and-int/lit8 v5, v5, -0x21

    goto :goto_0

    .line 8
    :pswitch_1
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_0

    and-int/lit8 v5, v5, -0x11

    goto :goto_0

    :cond_0
    const-string v2, "limit"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 9
    :pswitch_2
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_1

    and-int/lit8 v5, v5, -0x9

    goto :goto_0

    :cond_1
    const-string v2, "member_limit"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 10
    :pswitch_3
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/Integer;

    if-eqz v8, :cond_2

    and-int/lit8 v5, v5, -0x5

    goto :goto_0

    .line 11
    :cond_2
    const-string v2, "participant_limit"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 12
    :pswitch_4
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_3

    and-int/lit8 v5, v5, -0x3

    goto :goto_0

    :cond_3
    const-string v2, "reply_limit"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 13
    :pswitch_5
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_4

    and-int/lit8 v5, v5, -0x2

    goto :goto_0

    :cond_4
    const-string v2, "watch"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_6
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 15
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_0

    .line 16
    :cond_5
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    const/16 v1, -0x40

    if-ne v5, v1, :cond_6

    .line 17
    new-instance v11, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;

    .line 18
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    .line 19
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v13

    .line 20
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v14

    .line 21
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v15

    .line 22
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v16

    .line 23
    invoke-direct/range {v11 .. v17}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;-><init>(ZIIIILjava/lang/String;)V

    return-object v11

    .line 24
    :cond_6
    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v1, :cond_7

    .line 25
    const-class v23, Ljava/lang/String;

    .line 26
    sget-object v25, Lrx/f;->c:Ljava/lang/Class;

    sget-object v18, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v19, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v20, v19

    move-object/from16 v21, v19

    move-object/from16 v22, v19

    move-object/from16 v24, v19

    filled-new-array/range {v18 .. v25}, [Ljava/lang/Class;

    move-result-object v1

    .line 27
    const-class v2, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 28
    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    const-string v2, "also(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/4 v13, 0x0

    move-object/from16 v11, v17

    .line 30
    filled-new-array/range {v6 .. v13}, [Ljava/lang/Object;

    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "watch"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->getWatch()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "reply_limit"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->getReply_limit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "participant_limit"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->getParticipant_limit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "member_limit"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->getMember_limit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "limit"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->getLimit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    const-string v0, "next"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->getNext()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequestJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x26

    const-string v1, "GeneratedJsonAdapter(GetThreadRequest)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
