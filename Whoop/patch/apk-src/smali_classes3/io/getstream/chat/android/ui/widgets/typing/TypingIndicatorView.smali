.class public final Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;",
        "Landroid/widget/LinearLayout;",
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
        "(Landroid/util/AttributeSet;)V",
        "",
        "Lio/getstream/chat/android/models/User;",
        "users",
        "setTypingUsers",
        "(Ljava/util/List;)V",
        "Landroid/widget/TextView;",
        "userTypingTextView",
        "Landroid/widget/TextView;",
        "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;",
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
.field private style:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

.field private final userTypingTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->userTypingTextView:Landroid/widget/TextView;

    const/4 p1, 0x0

    .line 3
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance p1, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->userTypingTextView:Landroid/widget/TextView;

    .line 6
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    new-instance p1, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p1, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->userTypingTextView:Landroid/widget/TextView;

    .line 10
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 4

    const/16 v0, 0x8

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    const/16 v1, 0x10

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object v1, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->Companion:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, p1}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->style:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->style:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    const/4 v2, 0x0

    const-string v3, "style"

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->getTypingIndicatorAnimationView()I

    move-result v1

    invoke-virtual {p1, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->userTypingTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->style:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->getTypingIndicatorUsersTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {p1, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public final setTypingUsers(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "users"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v6, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->userTypingTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$plurals;->stream_ui_channel_header_typing_users:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/User;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v6, 0x1

    sub-int/2addr p1, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v5, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v3, v4, p1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
