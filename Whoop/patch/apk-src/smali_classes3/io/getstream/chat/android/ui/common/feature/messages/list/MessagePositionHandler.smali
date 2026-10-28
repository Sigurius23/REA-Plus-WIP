.class public interface abstract Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00e6\u0080\u0001\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cJ<\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
        "",
        "handleMessagePosition",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;",
        "previousMessage",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "nextMessage",
        "isAfterDateSeparator",
        "",
        "isBeforeDateSeparator",
        "isInThread",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

    return-void
.end method


# virtual methods
.method public abstract handleMessagePosition(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZ)Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;
.end method
