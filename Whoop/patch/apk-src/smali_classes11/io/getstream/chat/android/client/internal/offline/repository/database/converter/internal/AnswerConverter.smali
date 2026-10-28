.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0007R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0007\u0010\u0003R \u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\t0\u0005X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\n\u0010\u0003\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;",
        "",
        "<init>",
        "()V",
        "entityAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
        "getEntityAdapter$annotations",
        "entityListAdapter",
        "",
        "getEntityListAdapter$annotations",
        "stringToAnswer",
        "data",
        "",
        "answerToString",
        "entity",
        "stringToAnswerList",
        "answerListToString",
        "entities",
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
.field private final entityAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final entityListAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ConverterMoshiInstanceKt;->getMoshi()Lqx/l0;

    move-result-object v0

    const-class v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v2

    invoke-static {v0, v2}, Lug/m;->m(Lqx/l0;Lj93/a0;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;->entityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-static {}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ConverterMoshiInstanceKt;->getMoshi()Lqx/l0;

    move-result-object v0

    sget-object v2, Lj93/d0;->c:Lj93/d0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v1

    invoke-static {v1}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object v1

    const-class v2, Ljava/util/List;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/h0;->e(Ljava/lang/Class;Lj93/d0;)Lj93/a0;

    move-result-object v1

    invoke-static {v0, v1}, Lug/m;->m(Lqx/l0;Lj93/a0;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;->entityListAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method

.method private static synthetic getEntityAdapter$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getEntityListAdapter$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final answerListToString(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;->entityListAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final answerToString(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;->entityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final stringToAnswer(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;->entityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final stringToAnswerList(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;->entityListAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_2
    :goto_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method
