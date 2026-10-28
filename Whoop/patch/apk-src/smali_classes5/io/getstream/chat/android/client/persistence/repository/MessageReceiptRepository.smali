.class public interface abstract Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u001e\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0008H\u00a6@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\u00052\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u000e\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;",
        "",
        "",
        "Lio/getstream/chat/android/client/receipts/MessageReceipt;",
        "receipts",
        "Ll83/a0;",
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
        "(Lq83/d;)Ljava/lang/Object;",
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
.field public static final Companion:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository$Companion;->$$INSTANCE:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository$Companion;

    sput-object v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->Companion:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository$Companion;

    return-void
.end method


# virtual methods
.method public abstract clearMessageReceipts(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deleteMessageReceiptsByMessageIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectMessageReceipts(ILq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract upsertMessageReceipts(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
.end method
