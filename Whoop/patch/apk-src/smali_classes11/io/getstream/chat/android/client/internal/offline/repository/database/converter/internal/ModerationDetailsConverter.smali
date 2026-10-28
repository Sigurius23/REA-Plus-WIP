.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0007\u0010\u0003\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;",
        "",
        "<init>",
        "()V",
        "entityAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;",
        "getEntityAdapter$annotations",
        "stringToModerationDetails",
        "data",
        "",
        "moderationDetailsToString",
        "entity",
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ConverterMoshiInstanceKt;->getMoshi()Lqx/l0;

    move-result-object v0

    const-class v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v1

    invoke-static {v0, v1}, Lug/m;->m(Lqx/l0;Lj93/a0;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->entityAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method

.method private static synthetic getEntityAdapter$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final moderationDetailsToString(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->entityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->entityAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
