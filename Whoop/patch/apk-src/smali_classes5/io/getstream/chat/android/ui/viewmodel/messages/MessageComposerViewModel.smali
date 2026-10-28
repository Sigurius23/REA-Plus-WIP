.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00082\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001f\u0010 J\r\u0010!\u001a\u00020\u0008\u00a2\u0006\u0004\u0008!\u0010\u0018J\u0015\u0010$\u001a\u00020\u00082\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%J)\u0010*\u001a\u00020\u00082\u0008\u0008\u0002\u0010\'\u001a\u00020&2\u000e\u0008\u0002\u0010)\u001a\u0008\u0012\u0004\u0012\u00020&0(H\u0007\u00a2\u0006\u0004\u0008*\u0010+J)\u0010,\u001a\u00020&2\u0008\u0008\u0002\u0010\'\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007\u00a2\u0006\u0004\u0008,\u0010-J\r\u0010.\u001a\u00020\u0008\u00a2\u0006\u0004\u0008.\u0010\u0018J\u0015\u00101\u001a\u00020\u00082\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\u00081\u00102J\u0015\u00105\u001a\u00020\u00082\u0006\u00104\u001a\u000203\u00a2\u0006\u0004\u00085\u00106J\r\u00107\u001a\u00020\u0008\u00a2\u0006\u0004\u00087\u0010\u0018J\r\u00108\u001a\u00020\u0008\u00a2\u0006\u0004\u00088\u0010\u0018J\r\u00109\u001a\u00020\u0008\u00a2\u0006\u0004\u00089\u0010\u0018J\r\u0010:\u001a\u00020\u0008\u00a2\u0006\u0004\u0008:\u0010\u0018J\r\u0010;\u001a\u00020\u0008\u00a2\u0006\u0004\u0008;\u0010\u0018J\r\u0010<\u001a\u00020\u0008\u00a2\u0006\u0004\u0008<\u0010\u0018J\r\u0010=\u001a\u00020\u0008\u00a2\u0006\u0004\u0008=\u0010\u0018J\r\u0010>\u001a\u00020\u0008\u00a2\u0006\u0004\u0008>\u0010\u0018J+\u0010B\u001a\u00020\u00082\u001c\u0008\u0002\u0010A\u001a\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0@\u0012\u0004\u0012\u00020\u0008\u0018\u00010?\u00a2\u0006\u0004\u0008B\u0010CJ\r\u0010D\u001a\u00020\u0008\u00a2\u0006\u0004\u0008D\u0010\u0018J\u0015\u0010G\u001a\u00020\u00082\u0006\u0010F\u001a\u00020E\u00a2\u0006\u0004\u0008G\u0010HJ\r\u0010I\u001a\u00020\u0008\u00a2\u0006\u0004\u0008I\u0010\u0018J\u000f\u0010J\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008J\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010KR\u001d\u0010N\u001a\u0008\u0012\u0004\u0012\u00020M0L8\u0006\u00a2\u0006\u000c\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010QR\u001d\u0010S\u001a\u0008\u0012\u0004\u0012\u00020R0L8\u0006\u00a2\u0006\u000c\n\u0004\u0008S\u0010O\u001a\u0004\u0008T\u0010Q\u00a8\u0006U"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;",
        "messageComposerController",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V",
        "",
        "value",
        "Ll83/a0;",
        "setMessageInput",
        "(Ljava/lang/String;)V",
        "",
        "alsoSendToChannel",
        "setAlsoSendToChannel",
        "(Z)V",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
        "messageMode",
        "setMessageMode",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "messageAction",
        "performMessageAction",
        "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V",
        "dismissMessageActions",
        "()V",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachments",
        "addAttachments",
        "(Ljava/util/List;)V",
        "attachment",
        "removeAttachment",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "clearAttachments",
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "createPollParams",
        "createPoll",
        "(Lio/getstream/chat/android/models/CreatePollParams;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Lo23/a;",
        "callback",
        "sendMessage",
        "(Lio/getstream/chat/android/models/Message;Lo23/a;)V",
        "buildNewMessage",
        "(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/Message;",
        "leaveThread",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "selectMention",
        "(Lio/getstream/chat/android/models/User;)V",
        "Lio/getstream/chat/android/models/Command;",
        "command",
        "selectCommand",
        "(Lio/getstream/chat/android/models/Command;)V",
        "toggleCommandsVisibility",
        "clearData",
        "dismissSuggestionsPopup",
        "startRecording",
        "lockRecording",
        "cancelRecording",
        "stopRecording",
        "toggleRecordingPlayback",
        "Lkotlin/Function1;",
        "Ln23/h;",
        "onComplete",
        "completeRecording",
        "(Lkotlin/jvm/functions/Function1;)V",
        "pauseRecording",
        "",
        "progress",
        "seekRecordingTo",
        "(F)V",
        "sendRecording",
        "onCleared",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;",
        "Lec3/f2;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
        "messageComposerState",
        "Lec3/f2;",
        "getMessageComposerState",
        "()Lec3/f2;",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageInput;",
        "messageInput",
        "getMessageInput",
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


# instance fields
.field private final messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

.field private final messageComposerState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messageInput:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V
    .locals 1

    const-string v0, "messageComposerController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getState()Lec3/f2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerState:Lec3/f2;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->getMessageInput()Lec3/f2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageInput:Lec3/f2;

    return-void
.end method

.method public static synthetic buildNewMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageInput:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getText()Ljava/lang/String;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerState:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getAttachments()Ljava/util/List;

    move-result-object p2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->buildNewMessage(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic completeRecording$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->completeRecording(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic g(Ln23/h;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->sendMessage$lambda$0(Ln23/h;)V

    return-void
.end method

.method public static synthetic sendMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/Message;Lo23/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x3

    const/4 p4, 0x0

    invoke-static {p0, p4, p4, p1, p4}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->buildNewMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    new-instance p2, Li7/g;

    const/16 p3, 0xd

    invoke-direct {p2, p3}, Li7/g;-><init>(I)V

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->sendMessage(Lio/getstream/chat/android/models/Message;Lo23/a;)V

    return-void
.end method

.method private static final sendMessage$lambda$0(Ln23/h;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final addAttachments(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->addAttachments(Ljava/util/List;)V

    return-void
.end method

.method public final buildNewMessage()Lio/getstream/chat/android/models/Message;
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p0, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->buildNewMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method

.method public final buildNewMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 2

    .line 2
    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->buildNewMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1
.end method

.method public final buildNewMessage(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/Message;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Lio/getstream/chat/android/models/Message;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->buildNewMessage(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1
.end method

.method public final cancelRecording()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->cancelRecording()V

    return-void
.end method

.method public final clearAttachments()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->clearAttachments()V

    return-void
.end method

.method public final clearData()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->clearData()V

    return-void
.end method

.method public final completeRecording(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->completeRecording(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final createPoll(Lio/getstream/chat/android/models/CreatePollParams;)V
    .locals 3

    const-string v0, "createPollParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->createPoll$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/models/CreatePollParams;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public final dismissMessageActions()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissMessageActions()V

    return-void
.end method

.method public final dismissSuggestionsPopup()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->dismissSuggestionsPopup()V

    return-void
.end method

.method public final getMessageComposerState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerState:Lec3/f2;

    return-object v0
.end method

.method public final getMessageInput()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageInput:Lec3/f2;

    return-object v0
.end method

.method public final leaveThread()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->leaveThread()V

    return-void
.end method

.method public final lockRecording()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->lockRecording()V

    return-void
.end method

.method public final onCleared()V
    .locals 1

    invoke-super {p0}, Landroidx/lifecycle/w1;->onCleared()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->onCleared()V

    return-void
.end method

.method public final pauseRecording()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->pauseRecording()V

    return-void
.end method

.method public final performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V
    .locals 1

    const-string v0, "messageAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    return-void
.end method

.method public final removeAttachment(Lio/getstream/chat/android/models/Attachment;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->removeAttachment(Lio/getstream/chat/android/models/Attachment;)V

    return-void
.end method

.method public final seekRecordingTo(F)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->seekRecordingTo(F)V

    return-void
.end method

.method public final selectCommand(Lio/getstream/chat/android/models/Command;)V
    .locals 1

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectCommand(Lio/getstream/chat/android/models/Command;)V

    return-void
.end method

.method public final selectMention(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->selectMention(Lio/getstream/chat/android/models/User;)V

    return-void
.end method

.method public final sendMessage()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p0, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->sendMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/Message;Lo23/a;ILjava/lang/Object;)V

    return-void
.end method

.method public final sendMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    .line 2
    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->sendMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/Message;Lo23/a;ILjava/lang/Object;)V

    return-void
.end method

.method public final sendMessage(Lio/getstream/chat/android/models/Message;Lo23/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lo23/a;",
            ")V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sendMessage$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/models/Message;Lo23/a;Lc93/m;ILjava/lang/Object;)V

    return-void
.end method

.method public final sendRecording()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sendRecording()V

    return-void
.end method

.method public final setAlsoSendToChannel(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setAlsoSendToChannel(Z)V

    return-void
.end method

.method public final setMessageInput(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageInput(Ljava/lang/String;)V

    return-void
.end method

.method public final setMessageMode(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V
    .locals 1

    const-string v0, "messageMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageMode(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V

    return-void
.end method

.method public final startRecording()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->startRecording()V

    return-void
.end method

.method public final stopRecording()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->stopRecording()V

    return-void
.end method

.method public final toggleCommandsVisibility()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->toggleCommandsVisibility()V

    return-void
.end method

.method public final toggleRecordingPlayback()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->messageComposerController:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->toggleRecordingPlayback()V

    return-void
.end method
