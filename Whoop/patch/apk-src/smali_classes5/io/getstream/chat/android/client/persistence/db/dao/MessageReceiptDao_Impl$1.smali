.class public final Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "io/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$1",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Ltb/c;",
        "statement",
        "entity",
        "Ll83/a0;",
        "bind",
        "(Ltb/c;Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$1;->this$0:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bind(Ltb/c;Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;)V
    .locals 3

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$1;->this$0:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;)Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;->toDb(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object p2

    const/4 v0, 0x3

    if-nez p2, :cond_0

    .line 5
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    .line 6
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public final bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$1;->bind(Ltb/c;Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;)V

    return-void
.end method

.method public final createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `message_receipt` (`messageId`,`cid`,`createdAt`) VALUES (?,?,?)"

    return-object v0
.end method
