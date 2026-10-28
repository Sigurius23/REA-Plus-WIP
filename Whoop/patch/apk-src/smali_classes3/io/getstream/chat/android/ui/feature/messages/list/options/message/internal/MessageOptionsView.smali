.class public final Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0016\u001a\u00020\u000e2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;",
        "Landroid/widget/FrameLayout;",
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
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;",
        "listener",
        "Ll83/a0;",
        "setMessageActionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;)V",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
        "messageOptions",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
        "style",
        "setMessageOptions",
        "(Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;",
        "MessageActionClickListener",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;

.field private listener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->setMessageOptions$lambda$1$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;Landroid/view/View;)V

    return-void
.end method

.method private static final setMessageOptions$lambda$1$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->listener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->getMessageAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;->onMessageActionClick(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final setMessageActionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->listener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;

    return-void
.end method

.method public final setMessageOptions(Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            ")V"
        }
    .end annotation

    const-string v0, "messageOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;->messageOptionsContainer:Landroidx/cardview/widget/CardView;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getMessageOptionsBackgroundColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;->optionListContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const-string v2, "from(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_option_item:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->getOptionText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->getOptionIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setStartDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Lb13/a;

    const/16 v3, 0xe

    invoke-direct {v2, v3, p0, v0}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->isWarningItem()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getWarningMessageOptionsText()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getMessageOptionsText()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    :goto_1
    invoke-static {v1, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;->optionListContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    return-void
.end method
