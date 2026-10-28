.class public interface abstract Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00e6\u0080\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;",
        "",
        "formatMessagePreview",
        "",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "Companion",
        "stream-chat-android-ui-components_release"
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
.field public static final Companion:Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;->Companion:Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter$Companion;

    return-void
.end method


# virtual methods
.method public abstract formatMessagePreview(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Ljava/lang/CharSequence;
.end method
