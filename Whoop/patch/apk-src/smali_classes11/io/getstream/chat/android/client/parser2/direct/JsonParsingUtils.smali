.class public final Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J:\u0010\n\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u0082\u0002\n\n\u0008\u0008\u0000\u001a\u0004\u0008\u0003\u0010\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0018\u0010\u0019JA\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001d\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008 \u0010!J1\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f\"\u0004\u0008\u0000\u0010\u00042\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00000\"\u00a2\u0006\u0004\u0008$\u0010%J#\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010&2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\'\u0010(J#\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010&2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008)\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;",
        "",
        "<init>",
        "()V",
        "T",
        "value",
        "",
        "fieldName",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "requireField",
        "(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;",
        "Ll83/a0;",
        "rejectExplicitNull",
        "(Lcom/squareup/moshi/JsonReader;Ljava/lang/String;)V",
        "",
        "readNullableInt",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Integer;",
        "readNullableString",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;",
        "",
        "readNullableBoolean",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Boolean;",
        "",
        "readNullableLong",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Long;",
        "key",
        "",
        "extraData",
        "accumulateExtraData",
        "(Ljava/lang/String;Lcom/squareup/moshi/JsonReader;Ljava/util/Map;)Ljava/util/Map;",
        "",
        "parseStringList",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "adapter",
        "parseList",
        "(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;",
        "",
        "parseStringMap",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;",
        "parseIntMap",
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accumulateExtraData(Ljava/lang/String;Lcom/squareup/moshi/JsonReader;Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/squareup/moshi/JsonReader;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/squareup/moshi/JsonReader;->J()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    return-object p3

    :cond_0
    if-nez p3, :cond_1

    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_1
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3
.end method

.method public final parseIntMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonReader;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v2

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->y:Lqx/w;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    return-object v2

    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    return-object v0
.end method

.method public final parseList(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/squareup/moshi/JsonReader;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v2

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->w:Lqx/w;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    return-object v2

    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginArray()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p2, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endArray()V

    return-object v0
.end method

.method public final parseStringList(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonReader;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v2

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->w:Lqx/w;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    return-object v2

    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginArray()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "nextString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endArray()V

    return-object v0
.end method

.method public final parseStringMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonReader;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v2

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->y:Lqx/w;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    return-object v2

    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    return-object v0
.end method

.method public final readNullableBoolean(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final readNullableInt(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final readNullableLong(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Long;
    .locals 2

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;
    .locals 2

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final rejectExplicitNull(Lcom/squareup/moshi/JsonReader;Ljava/lang/String;)V
    .locals 3

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->I:Lqx/w;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Non-null value \'"

    const-string v2, "\' was null at "

    invoke-static {v1, p2, v2, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            "Lcom/squareup/moshi/JsonReader;",
            ")TT;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reader"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Lcom/squareup/moshi/JsonDataException;

    invoke-virtual {p3}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object p3

    const-string v0, "Required value \'"

    const-string v1, "\' missing at "

    invoke-static {v0, p2, v1, p3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
