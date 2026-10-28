.class public final Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;",
        "messages",
        "",
        "Lio/getstream/chat/android/models/Message;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/util/List;)Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/DeliveredMessageDto;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lio/getstream/chat/android/client/api2/model/requests/DeliveredMessageDto;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;

    invoke-direct {p1, v0}, Lio/getstream/chat/android/client/api2/model/requests/MarkDeliveredRequest;-><init>(Ljava/util/List;)V

    return-object p1
.end method
