.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0018\u0000 H2\u00020\u0001:\u0001HB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\'\u0010\u0014\u001a\u00020\u00002\u0018\u0010\r\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u0014\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u0015\u0010\u000fJ!\u0010\u0017\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u0017\u0010\u000fJ!\u0010\u0019\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u0019\u0010\u000fJ!\u0010\u001b\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u001b\u0010\u000fJ\u001b\u0010\u001c\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008\u001c\u0010\nJ\u001b\u0010\u001d\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008\u001d\u0010\nJ\u001b\u0010\u001e\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008\u001e\u0010\nJ\u001b\u0010\u001f\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008\u001f\u0010\nJ\u001b\u0010 \u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008 \u0010\nJ\u001b\u0010!\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008!\u0010\nJ\u001b\u0010\"\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008\"\u0010\nJ\u001b\u0010#\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008#\u0010\nJ\u001b\u0010$\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008$\u0010\nJ\u001b\u0010%\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008%\u0010\nJ\u001b\u0010&\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0004\u0008&\u0010\nJ!\u0010(\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008(\u0010\u000fJ!\u0010)\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008)\u0010\u000fJ\u001f\u00100\u001a\u00020\u000c2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0007\u00a2\u0006\u0004\u0008.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00101R\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u00102R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00104R\"\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00104R(\u00106\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00104R\"\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00104R\"\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00104R\"\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u00104R\"\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u00104R\u001c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u00102R\u001c\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u00102R\u001c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u00102R\u001c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u00102R\u001c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u00102R\u001c\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u00102R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u00102R\u001c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u00102R\u001c\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u00102R\u001c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u00102R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u00102R\"\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u00104R\"\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u00104\u00a8\u0006I"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;",
        "",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
        "vm",
        "<init>",
        "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)V",
        "Lkotlin/Function0;",
        "Lio/getstream/chat/android/models/Message;",
        "builder",
        "messageBuilder",
        "(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "listener",
        "onSendMessageButtonClick",
        "(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;",
        "",
        "onTextInputChange",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "onAttachmentSelection",
        "onAttachmentRemoval",
        "Lio/getstream/chat/android/models/User;",
        "onMentionSelection",
        "Lio/getstream/chat/android/models/Command;",
        "onCommandSelection",
        "",
        "onAlsoSendToChannelSelection",
        "onDismissActionClick",
        "onCommandsButtonClick",
        "onDismissSuggestions",
        "onAudioRecordButtonHold",
        "onAudioRecordButtonLock",
        "onAudioRecordButtonCancel",
        "onAudioRecordButtonRelease",
        "onAudioDeleteButtonClick",
        "onAudioStopButtonClick",
        "onAudioPlaybackButtonClick",
        "onAudioCompleteButtonClick",
        "",
        "onAudioSliderDragStart",
        "onAudioSliderDragStop",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;",
        "view",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroidx/lifecycle/g0;)V",
        "bindView",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
        "Lc93/a;",
        "sendMessageButtonClickListener",
        "Lkotlin/jvm/functions/Function1;",
        "textInputChangeListener",
        "attachmentSelectionListener",
        "attachmentRemovalListener",
        "mentionSelectionListener",
        "commandSelectionListener",
        "alsoSendToChannelSelectionListener",
        "dismissActionClickListener",
        "commandsButtonClickListener",
        "dismissSuggestionsListener",
        "audioRecordButtonHoldListener",
        "audioRecordButtonLockListener",
        "audioRecordButtonCancelListener",
        "audioRecordButtonReleaseListener",
        "audioDeleteButtonClickListener",
        "audioStopButtonClickListener",
        "audioPlaybackButtonClickListener",
        "audioCompleteButtonClickListener",
        "audioSliderDragStartListener",
        "audioSliderDragStopListener",
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
.field public static final Companion:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder$Companion;


# instance fields
.field private alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private attachmentRemovalListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private attachmentSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private audioCompleteButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioDeleteButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioPlaybackButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioRecordButtonCancelListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioRecordButtonHoldListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioRecordButtonLockListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioRecordButtonReleaseListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private audioStopButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private commandSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private commandsButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private dismissActionClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private dismissSuggestionsListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private mentionSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private messageBuilder:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private sendMessageButtonClickListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private textInputChangeListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final vm:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->Companion:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder$Companion;

    return-void
.end method

.method private constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->vm:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    .line 4
    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/b;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->messageBuilder:Lc93/a;

    .line 5
    sget-object v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getSendMessageButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->sendMessageButtonClickListener:Lkotlin/jvm/functions/Function1;

    .line 6
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getTextInputChangeListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    .line 7
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAttachmentSelectionListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->attachmentSelectionListener:Lkotlin/jvm/functions/Function1;

    .line 8
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAttachmentRemovalListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    .line 9
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getMentionSelectionListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    .line 10
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getCommandSelectionListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    .line 11
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAlsoSendToChannelSelectionListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;

    .line 12
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getDismissActionClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->dismissActionClickListener:Lc93/a;

    .line 13
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getCommandsButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->commandsButtonClickListener:Lc93/a;

    .line 14
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getDismissSuggestionsListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->dismissSuggestionsListener:Lc93/a;

    .line 15
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAudioRecordButtonHoldListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonHoldListener:Lc93/a;

    .line 16
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAudioRecordButtonLockListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonLockListener:Lc93/a;

    .line 17
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAudioRecordButtonCancelListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonCancelListener:Lc93/a;

    .line 18
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAudioDeleteButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioDeleteButtonClickListener:Lc93/a;

    .line 19
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAudioStopButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioStopButtonClickListener:Lc93/a;

    .line 20
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAudioPlaybackButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioPlaybackButtonClickListener:Lc93/a;

    .line 21
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAudioSliderDragStartListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;

    .line 22
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->getAudioSliderDragStopListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)V

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;)Lio/getstream/chat/android/models/Message;
    .locals 2

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->vm:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p0, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->buildNewMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private static final messageBuilder$lambda$0(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;)Lio/getstream/chat/android/models/Message;
    .locals 2

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->vm:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p0, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->buildNewMessage$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private static final onAudioCompleteButtonClick$lambda$1(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final with(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->Companion:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder$Companion;

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder$Companion;->with(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroidx/lifecycle/g0;)V
    .locals 29

    move-object/from16 v0, p0

    const-string v1, "view"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "lifecycleOwner"

    move-object/from16 v4, p2

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->vm:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    iget-object v5, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->messageBuilder:Lc93/a;

    iget-object v6, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->sendMessageButtonClickListener:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->attachmentSelectionListener:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->dismissActionClickListener:Lc93/a;

    iget-object v15, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->commandsButtonClickListener:Lc93/a;

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->dismissSuggestionsListener:Lc93/a;

    iget-object v10, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonHoldListener:Lc93/a;

    move-object/from16 v16, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonLockListener:Lc93/a;

    move-object/from16 v18, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonCancelListener:Lc93/a;

    move-object/from16 v19, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonReleaseListener:Lc93/a;

    if-nez v1, :cond_0

    sget-object v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getComposerStyle$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingSendOnComplete()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->audioRecordButtonReleaseListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Lc93/a;

    move-result-object v1

    :cond_0
    move-object/from16 v20, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioDeleteButtonClickListener:Lc93/a;

    iget-object v3, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioStopButtonClickListener:Lc93/a;

    move-object/from16 v21, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioPlaybackButtonClickListener:Lc93/a;

    move-object/from16 v23, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioCompleteButtonClickListener:Lc93/a;

    if-nez v1, :cond_1

    sget-object v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;

    move-object/from16 v17, v2

    iget-object v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->vm:Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getComposerStyle$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v22

    move-object/from16 v24, v3

    invoke-virtual/range {v22 .. v22}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingSendOnComplete()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;->audioCompleteButtonClickListener(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Lc93/a;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object/from16 v17, v2

    move-object/from16 v24, v3

    :goto_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;

    const/16 v27, 0x80

    const/16 v28, 0x0

    move-object/from16 v25, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v26, v3

    move-object/from16 v22, v24

    move-object/from16 v3, p1

    move-object/from16 v24, v1

    invoke-static/range {v2 .. v28}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinding;->bind$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroidx/lifecycle/g0;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public final messageBuilder(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->messageBuilder:Lc93/a;

    return-object p0
.end method

.method public final onAlsoSendToChannelSelection(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public final onAttachmentRemoval(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public final onAttachmentSelection(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->attachmentSelectionListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public final onAudioCompleteButtonClick(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/b;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/b;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioCompleteButtonClickListener:Lc93/a;

    return-object p0
.end method

.method public final onAudioDeleteButtonClick(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioDeleteButtonClickListener:Lc93/a;

    return-object p0
.end method

.method public final onAudioPlaybackButtonClick(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioPlaybackButtonClickListener:Lc93/a;

    return-object p0
.end method

.method public final onAudioRecordButtonCancel(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonCancelListener:Lc93/a;

    return-object p0
.end method

.method public final onAudioRecordButtonHold(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonHoldListener:Lc93/a;

    return-object p0
.end method

.method public final onAudioRecordButtonLock(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonLockListener:Lc93/a;

    return-object p0
.end method

.method public final onAudioRecordButtonRelease(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioRecordButtonReleaseListener:Lc93/a;

    return-object p0
.end method

.method public final onAudioSliderDragStart(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public final onAudioSliderDragStop(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public final onAudioStopButtonClick(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->audioStopButtonClickListener:Lc93/a;

    return-object p0
.end method

.method public final onCommandSelection(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public final onCommandsButtonClick(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->commandsButtonClickListener:Lc93/a;

    return-object p0
.end method

.method public final onDismissActionClick(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->dismissActionClickListener:Lc93/a;

    return-object p0
.end method

.method public final onDismissSuggestions(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->dismissSuggestionsListener:Lc93/a;

    return-object p0
.end method

.method public final onMentionSelection(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public final onSendMessageButtonClick(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->sendMessageButtonClickListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public final onTextInputChange(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method
