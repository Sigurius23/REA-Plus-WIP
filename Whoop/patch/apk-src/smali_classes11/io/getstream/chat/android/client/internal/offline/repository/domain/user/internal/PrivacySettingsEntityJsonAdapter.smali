.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;",
        "nullableTypingIndicatorsEntityAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;",
        "nullableReadReceiptsEntityAdapter",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;",
        "nullableDeliveryReceiptsEntityAdapter",
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDeliveryReceiptsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableReadReceiptsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableTypingIndicatorsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final options:Lqx/v;


# direct methods
.method public constructor <init>(Lqx/l0;)V
    .locals 5

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v0, "typingIndicators"

    const-string v1, "readReceipts"

    const-string v2, "deliveryReceipts"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v3

    iput-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->options:Lqx/v;

    const-class v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p1, v3, v4, v0}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->nullableTypingIndicatorsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;

    invoke-virtual {p1, v0, v4, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->nullableReadReceiptsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;

    invoke-virtual {p1, v0, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->nullableDeliveryReceiptsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;
    .locals 9

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v0, 0x0

    const/4 v1, -0x1

    move-object v3, v0

    move-object v4, v3

    move-object v5, v4

    move v2, v1

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 4
    iget-object v6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->options:Lqx/v;

    invoke-virtual {p1, v6}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v6

    if-eq v6, v1, :cond_3

    if-eqz v6, :cond_2

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->nullableDeliveryReceiptsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;

    and-int/lit8 v2, v2, -0x5

    goto :goto_0

    .line 6
    :cond_1
    iget-object v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->nullableReadReceiptsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v4, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;

    and-int/lit8 v2, v2, -0x3

    goto :goto_0

    .line 7
    :cond_2
    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->nullableTypingIndicatorsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v3, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;

    and-int/lit8 v2, v2, -0x2

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 9
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_0

    .line 10
    :cond_4
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    const/4 p1, -0x8

    if-ne v2, p1, :cond_5

    .line 11
    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    invoke-direct {p1, v3, v4, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;)V

    return-object p1

    .line 12
    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez p1, :cond_6

    .line 13
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v1, Lrx/f;->c:Ljava/lang/Class;

    const-class v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;

    const-class v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;

    const-class v8, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;

    filled-new-array {v6, v7, v8, p1, v1}, [Ljava/lang/Class;

    move-result-object p1

    .line 14
    const-class v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 15
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 16
    const-string v1, "also(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    :cond_6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 18
    filled-new-array {v3, v4, v5, v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "newInstance(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    return-object p1
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "typingIndicators"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->nullableTypingIndicatorsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;->getTypingIndicators()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "readReceipts"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->nullableReadReceiptsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;->getReadReceipts()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "deliveryReceipts"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->nullableDeliveryReceiptsEntityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;->getDeliveryReceipts()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;

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

.method public final bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2b

    const-string v1, "GeneratedJsonAdapter(PrivacySettingsEntity)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
