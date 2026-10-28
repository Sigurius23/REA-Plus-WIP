.class public final Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toEntity",
        "Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;",
        "Lio/getstream/chat/android/client/receipts/MessageReceipt;",
        "toModel",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toEntity(Lio/getstream/chat/android/client/receipts/MessageReceipt;)Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/receipts/MessageReceipt;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/receipts/MessageReceipt;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/receipts/MessageReceipt;->getCreatedAt()Ljava/util/Date;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    return-object v0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;)Lio/getstream/chat/android/client/receipts/MessageReceipt;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/receipts/MessageReceipt;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lio/getstream/chat/android/client/receipts/MessageReceipt;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    return-object v0
.end method
