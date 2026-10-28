.class public Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u001b\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\tB#\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0005\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J5\u0010\u001d\u001a\u00028\u0000\"\u0012\u0008\u0000\u0010\u0018*\u0008\u0012\u0004\u0012\u00028\u00010\u0016*\u00020\u0017\"\u0008\u0008\u0001\u0010\u001a*\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008#\u0010\u0013R\"\u0010%\u001a\u00020$8\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\"\u0010\u001c\u001a\u00020\u001b8\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010+\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\"\u00100\u001a\u00020\u00178\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R0\u00108\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\r\u0018\u0001068\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R0\u0010?\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\r\u0018\u0001068\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008?\u00109\u001a\u0004\u0008@\u0010;\"\u0004\u0008A\u0010=\u00a8\u0006B"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;",
        "Landroid/widget/FrameLayout;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "init",
        "()V",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
        "state",
        "renderTextInputState",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V",
        "renderReplyState",
        "renderAttachmentState",
        "Landroidx/recyclerview/widget/i1;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;",
        "T",
        "Landroidx/recyclerview/widget/o2;",
        "VH",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "style",
        "buildAdapter",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Landroidx/recyclerview/widget/i1;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;",
        "messageComposerContext",
        "attachContext",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V",
        "renderState",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;",
        "setBinding",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;)V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "setStyle",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V",
        "attachmentsAdapter",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;",
        "getAttachmentsAdapter",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;",
        "setAttachmentsAdapter",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;)V",
        "Lkotlin/Function1;",
        "",
        "textInputChangeListener",
        "Lkotlin/jvm/functions/Function1;",
        "getTextInputChangeListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setTextInputChangeListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachmentRemovalListener",
        "getAttachmentRemovalListener",
        "setAttachmentRemovalListener",
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
.field private attachmentRemovalListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field protected attachmentsAdapter:Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;

.field protected binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

.field protected style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

.field private textInputChangeListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->init()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->buildAdapter$lambda$1(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;Lio/getstream/chat/android/models/Attachment;)Ll83/a0;

    return-void
.end method

.method private static final buildAdapter$lambda$1(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;Lio/getstream/chat/android/models/Attachment;)Ll83/a0;
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getAttachmentRemovalListener()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final init()V
    .locals 2

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->setBinding(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v1, "messageEditText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent$init$$inlined$doAfterTextChanged$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent$init$$inlined$doAfterTextChanged$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private final renderAttachmentState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->attachmentsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "attachmentsRecyclerView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getAttachments()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getAttachmentsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getAttachments()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;->setAttachments(Ljava/util/List;)V

    return-void
.end method

.method private final renderReplyState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputShowReplyView()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    const-string v1, "messageReplyView"

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/Reply;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageReplyView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v2

    invoke-interface {v2}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->toMessageReplyStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->setMessage(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageReplyView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageReplyView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final renderTextInputState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 3

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getInputValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getInputValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/capabilities/MessageComposerCapabilitiesKt;->canSendMessage(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle;->getHint()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputMaxLines()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputCannotSendHintText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    return-void
.end method


# virtual methods
.method public final attachContext(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V
    .locals 1

    const-string v0, "messageComposerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->setStyle(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->buildAdapter(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Landroidx/recyclerview/widget/i1;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->setAttachmentsAdapter(Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->attachmentsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageInputContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v0, "messageEditText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputScrollbarEnabled()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputScrollbarFadingEnabled()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputInputType()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setInputType(I)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputCursorDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextCursorDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public final buildAdapter(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Landroidx/recyclerview/widget/i1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/recyclerview/widget/i1;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;",
            "VH:",
            "Landroidx/recyclerview/widget/o2;",
            ">(",
            "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
            ")TT;"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getAttachmentPreviewFactoryManager()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/content/b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/content/b;-><init>(Landroid/widget/FrameLayout;I)V

    invoke-direct {v0, v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final findViewByKey(Ljava/lang/String;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->findViewByKey(Ljava/lang/String;)Landroid/view/View;

    const/4 p1, 0x0

    return-object p1
.end method

.method public getAttachmentRemovalListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getAttachmentsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->attachmentsAdapter:Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "attachmentsAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getTextInputChangeListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getRecording()Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->renderTextInputState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->renderReplyState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->renderAttachmentState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    return-void
.end method

.method public setAttachmentRemovalListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setAttachmentsAdapter(Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->attachmentsAdapter:Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;

    return-void
.end method

.method public final setBinding(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    return-void
.end method

.method public final setStyle(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    return-void
.end method

.method public setTextInputChangeListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method
