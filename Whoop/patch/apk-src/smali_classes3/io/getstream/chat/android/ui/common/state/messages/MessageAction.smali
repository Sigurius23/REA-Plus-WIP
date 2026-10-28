.class public abstract Lio/getstream/chat/android/ui/common/state/messages/MessageAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u000f\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "",
        "<init>",
        "()V",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/ui/common/state/messages/BlockUser;",
        "Lio/getstream/chat/android/ui/common/state/messages/Copy;",
        "Lio/getstream/chat/android/ui/common/state/messages/CustomAction;",
        "Lio/getstream/chat/android/ui/common/state/messages/Delete;",
        "Lio/getstream/chat/android/ui/common/state/messages/Edit;",
        "Lio/getstream/chat/android/ui/common/state/messages/Flag;",
        "Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;",
        "Lio/getstream/chat/android/ui/common/state/messages/MuteUser;",
        "Lio/getstream/chat/android/ui/common/state/messages/Pin;",
        "Lio/getstream/chat/android/ui/common/state/messages/React;",
        "Lio/getstream/chat/android/ui/common/state/messages/Reply;",
        "Lio/getstream/chat/android/ui/common/state/messages/Resend;",
        "Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;",
        "Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;",
        "Lio/getstream/chat/android/ui/common/state/messages/UnmuteUser;",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getMessage()Lio/getstream/chat/android/models/Message;
.end method
