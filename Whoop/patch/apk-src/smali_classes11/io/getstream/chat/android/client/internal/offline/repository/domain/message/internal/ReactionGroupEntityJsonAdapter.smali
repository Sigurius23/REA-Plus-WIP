.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0018\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "stringAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "intAdapter",
        "Ljava/util/Date;",
        "dateAdapter",
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

.field private final intAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Integer;",
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
    .locals 5

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v0, "lastReactionAt"

    const-string v1, "type"

    const-string v2, "count"

    const-string v3, "sumScore"

    const-string v4, "firstReactionAt"

    filled-new-array {v1, v2, v3, v4, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->options:Lqx/v;

    const-class v0, Ljava/lang/String;

    sget-object v3, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p1, v0, v3, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, v0, v3, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Ljava/util/Date;

    invoke-virtual {p1, v0, v3, v4}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;
    .locals 12

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    move-object v5, v2

    move-object v6, v5

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v3

    const-string v4, "type"

    const-string v7, "count"

    const-string v8, "sumScore"

    const-string v9, "firstReactionAt"

    const-string v10, "lastReactionAt"

    if-eqz v3, :cond_b

    .line 4
    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->options:Lqx/v;

    invoke-virtual {p1, v3}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v3

    const/4 v11, -0x1

    if-eq v3, v11, :cond_a

    if-eqz v3, :cond_8

    const/4 v4, 0x1

    if-eq v3, v4, :cond_6

    const/4 v4, 0x2

    if-eq v3, v4, :cond_4

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v3, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/util/Date;

    if-eqz v6, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {v10, v10, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 7
    :cond_2
    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v3, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/Date;

    if-eqz v5, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {v9, v9, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 9
    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {v8, v8, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 10
    :cond_6
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {v7, v7, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 11
    :cond_8
    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_9

    goto :goto_0

    :cond_9
    invoke-static {v4, v4, p1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 12
    :cond_a
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 13
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_0

    .line 14
    :cond_b
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    move-object v3, v1

    .line 15
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;

    if-eqz v2, :cond_10

    if-eqz v0, :cond_f

    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v3, :cond_e

    .line 17
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eqz v5, :cond_d

    if-eqz v6, :cond_c

    move v3, v0

    .line 18
    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;-><init>(Ljava/lang/String;IILjava/util/Date;Ljava/util/Date;)V

    return-object v1

    .line 19
    :cond_c
    invoke-static {v10, v10, p1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 20
    :cond_d
    invoke-static {v9, v9, p1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 21
    :cond_e
    invoke-static {v8, v8, p1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 22
    :cond_f
    invoke-static {v7, v7, p1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    .line 23
    :cond_10
    invoke-static {v4, v4, p1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "sumScore"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getSumScore()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "firstReactionAt"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getFirstReactionAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "lastReactionAt"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getLastReactionAt()Ljava/util/Date;

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

.method public final bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntityJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x29

    const-string v1, "GeneratedJsonAdapter(ReactionGroupEntity)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
