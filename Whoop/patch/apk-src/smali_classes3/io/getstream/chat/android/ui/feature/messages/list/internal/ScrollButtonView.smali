.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u000c2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010\"\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\u0008\"\u0010\u0012R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010#R\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;",
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
        "Ll83/a0;",
        "setActionButtonStyle",
        "()V",
        "setBadgeStyle",
        "unreadCount",
        "setUnreadCountValue",
        "(I)V",
        "",
        "isVisible",
        "setUnreadCountTextViewVisible",
        "(Z)V",
        "",
        "formatUnreadCount",
        "(I)Ljava/lang/CharSequence;",
        "Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;",
        "scrollButtonViewStyle",
        "setScrollButtonViewStyle",
        "(Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;)V",
        "Landroid/view/View$OnClickListener;",
        "listener",
        "setOnClickListener",
        "(Landroid/view/View$OnClickListener;)V",
        "setUnreadCount",
        "Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;",
        "I",
        "Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView$Companion;

.field private static final MAX_UNREAD_VALUE:I = 0x3e7


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

.field private scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

.field private unreadCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    return-void
.end method

.method private final formatUnreadCount(I)Ljava/lang/CharSequence;
    .locals 1

    const/16 v0, 0x3e7

    if-le p1, v0, :cond_0

    const-string p1, "999+"

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final setActionButtonStyle()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->scrollActionButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const-string v1, "scrollButtonViewStyle"

    if-eqz v0, :cond_2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonInternalMargin()I

    move-result v3

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->scrollActionButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonRippleColor()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setRippleColor(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->scrollActionButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->scrollActionButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonColor()I

    move-result v3

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->scrollActionButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonElevation()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setCompatElevation(F)V

    return-void

    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final setBadgeStyle()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->unreadCountTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const-string v1, "scrollButtonViewStyle"

    if-eqz v0, :cond_2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonBadgeGravity()I

    move-result v3

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->unreadCountTextView:Landroid/widget/TextView;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonBadgeElevation()F

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setElevation(F)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->unreadCountTextView:Landroid/widget/TextView;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonBadgeIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonBadgeColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->unreadCountTextView:Landroid/widget/TextView;

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->unreadCountTextView:Landroid/widget/TextView;

    const-string v3, "unreadCountTextView"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonBadgeTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final setUnreadCountTextViewVisible(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->unreadCountTextView:Landroid/widget/TextView;

    const-string v1, "unreadCountTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final setUnreadCountValue(I)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->unreadCount:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->unreadCount:I

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->unreadCountTextView:Landroid/widget/TextView;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->formatUnreadCount(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;->scrollActionButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setScrollButtonViewStyle(Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;)V
    .locals 1

    const-string v0, "scrollButtonViewStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->setActionButtonStyle()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->setBadgeStyle()V

    return-void
.end method

.method public final setUnreadCount(I)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    const/4 v1, 0x0

    const-string v2, "scrollButtonViewStyle"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonEnabled()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->scrollButtonViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;->getScrollButtonUnreadEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->setUnreadCountValue(I)V

    if-lez p1, :cond_0

    const/4 v3, 0x1

    :cond_0
    invoke-direct {p0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->setUnreadCountTextViewVisible(Z)V

    return-void

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-direct {p0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->setUnreadCountTextViewVisible(Z)V

    return-void

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
