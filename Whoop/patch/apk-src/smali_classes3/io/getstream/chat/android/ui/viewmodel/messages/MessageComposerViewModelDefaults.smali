.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u001f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\nR!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R!\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0010R\'\u0010\u0018\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0010R!\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0010R!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0010R!\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0010R!\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u0010R!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u0010R\u001b\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\u001b\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\'R\u001b\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\'R\u001b\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010\'R\u001b\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\'R\u001b\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u00081\u0010\'R\u001b\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u00083\u0010\'R\u001b\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u00085\u0010\'R\u001b\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u00087\u0010\'R!\u0010;\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010\u0010R!\u0010=\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00080\r*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010\u0010\u00a8\u0006>"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
        "",
        "sendOnComplete",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "audioRecordButtonReleaseListener",
        "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Lc93/a;",
        "audioCompleteButtonClickListener",
        "defaultAudioRecordingFinishedListener",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Message;",
        "getSendMessageButtonClickListener",
        "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;",
        "sendMessageButtonClickListener",
        "",
        "getTextInputChangeListener",
        "textInputChangeListener",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "getAttachmentSelectionListener",
        "attachmentSelectionListener",
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "getPollSubmissionListener",
        "pollSubmissionListener",
        "getAttachmentRemovalListener",
        "attachmentRemovalListener",
        "Lio/getstream/chat/android/models/User;",
        "getMentionSelectionListener",
        "mentionSelectionListener",
        "Lio/getstream/chat/android/models/Command;",
        "getCommandSelectionListener",
        "commandSelectionListener",
        "getAlsoSendToChannelSelectionListener",
        "alsoSendToChannelSelectionListener",
        "getDismissActionClickListener",
        "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;",
        "dismissActionClickListener",
        "getCommandsButtonClickListener",
        "commandsButtonClickListener",
        "getDismissSuggestionsListener",
        "dismissSuggestionsListener",
        "getAudioRecordButtonHoldListener",
        "audioRecordButtonHoldListener",
        "getAudioRecordButtonLockListener",
        "audioRecordButtonLockListener",
        "getAudioRecordButtonCancelListener",
        "audioRecordButtonCancelListener",
        "getAudioDeleteButtonClickListener",
        "audioDeleteButtonClickListener",
        "getAudioStopButtonClickListener",
        "audioStopButtonClickListener",
        "getAudioPlaybackButtonClickListener",
        "audioPlaybackButtonClickListener",
        "",
        "getAudioSliderDragStartListener",
        "audioSliderDragStartListener",
        "getAudioSliderDragStopListener",
        "audioSliderDragStopListener",
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final _get_alsoSendToChannelSelectionListener_$lambda$4(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->setAlsoSendToChannel(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_audioDeleteButtonClickListener_$lambda$11(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->cancelRecording()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_audioPlaybackButtonClickListener_$lambda$13(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->toggleRecordingPlayback()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_audioRecordButtonCancelListener_$lambda$10(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->cancelRecording()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_audioRecordButtonHoldListener_$lambda$8(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->startRecording()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_audioRecordButtonLockListener_$lambda$9(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->lockRecording()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_audioSliderDragStartListener_$lambda$14(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;F)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->pauseRecording()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_audioSliderDragStopListener_$lambda$15(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;F)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->seekRecordingTo(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_audioStopButtonClickListener_$lambda$12(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->stopRecording()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_commandSelectionListener_$lambda$3(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/Command;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->selectCommand(Lio/getstream/chat/android/models/Command;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_commandsButtonClickListener_$lambda$6(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->toggleCommandsVisibility()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_dismissActionClickListener_$lambda$5(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->dismissMessageActions()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_dismissSuggestionsListener_$lambda$7(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->dismissSuggestionsPopup()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_mentionSelectionListener_$lambda$2(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/User;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->selectMention(Lio/getstream/chat/android/models/User;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_pollSubmissionListener_$lambda$1(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/CreatePollParams;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->createPoll(Lio/getstream/chat/android/models/CreatePollParams;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _get_textInputChangeListener_$lambda$0(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->setMessageInput(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->_get_mentionSelectionListener_$lambda$2(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/User;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/CreatePollParams;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->_get_pollSubmissionListener_$lambda$1(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/CreatePollParams;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/Command;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->_get_commandSelectionListener_$lambda$3(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/models/Command;)Ll83/a0;

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->_get_textInputChangeListener_$lambda$0(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;)Ll83/a0;

    return-void
.end method

.method private static final defaultAudioRecordingFinishedListener$lambda$16(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->sendRecording()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final defaultAudioRecordingFinishedListener$lambda$17(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Ll83/a0;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->completeRecording$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final audioCompleteButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            "Z)",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->defaultAudioRecordingFinishedListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Lc93/a;

    move-result-object p1

    return-object p1
.end method

.method public final audioRecordButtonReleaseListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            "Z)",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->defaultAudioRecordingFinishedListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Lc93/a;

    move-result-object p1

    return-object p1
.end method

.method public final defaultAudioRecordingFinishedListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            "Z)",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/16 v0, 0xb

    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object p2

    :cond_0
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/16 v0, 0xc

    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object p2
.end method

.method public final getAlsoSendToChannelSelectionListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/e;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/e;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getAttachmentRemovalListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults$attachmentRemovalListener$1;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults$attachmentRemovalListener$1;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getAttachmentSelectionListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults$attachmentSelectionListener$1;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults$attachmentSelectionListener$1;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getAudioDeleteButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getAudioPlaybackButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getAudioRecordButtonCancelListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getAudioRecordButtonHoldListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getAudioRecordButtonLockListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getAudioSliderDragStartListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/e;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/e;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getAudioSliderDragStopListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/e;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getAudioStopButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getCommandSelectionListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/e;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/e;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getCommandsButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getDismissActionClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getDismissSuggestionsListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/c;

    const/16 v1, 0x8

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getMentionSelectionListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/e;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/e;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getPollSubmissionListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/e;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/e;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method

.method public final getSendMessageButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults$sendMessageButtonClickListener$1;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults$sendMessageButtonClickListener$1;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getTextInputChangeListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/e;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/e;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;I)V

    return-object v0
.end method
