.class public final Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "",
        "",
        "mapOfStringAnyAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "listOfStringAdapter",
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
            "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;",
            ">;"
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

.field private final options:Lqx/v;


# direct methods
.method public constructor <init>(Lqx/l0;)V
    .locals 7

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v0, "set"

    const-string v1, "unset"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v2

    iput-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->options:Lqx/v;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/reflect/Type;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v5, 0x1

    const-class v6, Ljava/lang/Object;

    aput-object v6, v2, v5

    const-class v6, Ljava/util/Map;

    invoke-static {v6, v2}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v2

    sget-object v6, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p1, v2, v6, v0}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v0, v5, [Ljava/lang/reflect/Type;

    aput-object v4, v0, v3

    const-class v2, Ljava/util/List;

    invoke-static {v2, v0}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v0

    invoke-virtual {p1, v0, v6, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;
    .locals 7

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v0, 0x0

    const/4 v1, -0x1

    move-object v3, v0

    move-object v4, v3

    move v2, v1

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 4
    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->options:Lqx/v;

    invoke-virtual {p1, v5}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v5

    if-eq v5, v1, :cond_4

    if-eqz v5, :cond_2

    const/4 v6, 0x1

    if-eq v5, v6, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v4, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_1

    and-int/lit8 v2, v2, -0x3

    goto :goto_0

    :cond_1
    const-string v0, "unset"

    invoke-static {v0, v0, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 6
    :cond_2
    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v3, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-eqz v3, :cond_3

    and-int/lit8 v2, v2, -0x2

    goto :goto_0

    :cond_3
    const-string v0, "set_"

    const-string v1, "set"

    invoke-static {v0, v1, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 7
    :cond_4
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 8
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_0

    .line 9
    :cond_5
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    const/4 p1, -0x4

    if-ne v2, p1, :cond_6

    .line 10
    new-instance p1, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;

    .line 11
    const-string v0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p1, v3, v4}, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;-><init>(Ljava/util/Map;Ljava/util/List;)V

    return-object p1

    .line 14
    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez p1, :cond_7

    .line 15
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v1, Lrx/f;->c:Ljava/lang/Class;

    const-class v5, Ljava/util/Map;

    const-class v6, Ljava/util/List;

    filled-new-array {v5, v6, p1, v1}, [Ljava/lang/Class;

    move-result-object p1

    .line 16
    const-class v1, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 17
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 18
    const-string v1, "also(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    :cond_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 20
    filled-new-array {v3, v4, v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "newInstance(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;

    return-object p1
.end method

.method public bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "set"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;->getSet()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "unset"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;->getUnset()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequestJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/PartialUpdatePollRequest;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2e

    const-string v1, "GeneratedJsonAdapter(PartialUpdatePollRequest)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
