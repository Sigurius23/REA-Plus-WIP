.class public final Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096A\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0096A\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\u00052\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0008H\u0096A\u00a2\u0006\u0004\u0008\u0013\u0010\u000cJ\u0010\u0010\u0014\u001a\u00020\u0005H\u0096A\u00a2\u0006\u0004\u0008\u0014\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;",
        "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;",
        "messageReceiptRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;)V",
        "Ll83/a0;",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "Lio/getstream/chat/android/client/receipts/MessageReceipt;",
        "receipts",
        "upsertMessageReceipts",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "limit",
        "selectMessageReceipts",
        "(ILq83/d;)Ljava/lang/Object;",
        "",
        "messageIds",
        "deleteMessageReceiptsByMessageIds",
        "clearMessageReceipts",
        "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository$Companion;


# instance fields
.field private final messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;->Companion:Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;)V
    .locals 1

    const-string v0, "messageReceiptRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    return-void
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->clearMessageReceipts(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final clearMessageReceipts(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->clearMessageReceipts(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final deleteMessageReceiptsByMessageIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->deleteMessageReceiptsByMessageIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessageReceipts(ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/receipts/MessageReceipt;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->selectMessageReceipts(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final upsertMessageReceipts(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/receipts/MessageReceipt;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->upsertMessageReceipts(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
