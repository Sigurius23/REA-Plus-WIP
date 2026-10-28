.class final Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;
.super Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder<",
        "Lio/getstream/chat/android/models/User;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u000c\u001a\u00020\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;",
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;",
        "Lio/getstream/chat/android/models/User;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "style",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "mentionSelectionListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V",
        "item",
        "bind",
        "(Lio/getstream/chat/android/models/User;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;",
        "Lkotlin/jvm/functions/Function1;",
        "getMentionSelectionListener",
        "()Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "mentionTemplateText",
        "Ljava/lang/String;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;

.field private item:Lio/getstream/chat/android/models/User;

.field private final mentionSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final mentionTemplateText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;",
            "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSelectionListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMentionSuggestionItemMentionText()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->mentionTemplateText:Ljava/lang/String;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->usernameTextView:Landroid/widget/TextView;

    const-string v0, "usernameTextView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMentionSuggestionItemUsernameTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p3, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object p3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->mentionNameTextView:Landroid/widget/TextView;

    const-string v0, "mentionNameTextView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMentionSuggestionItemMentionTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p3, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->mentionsIcon:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMentionSuggestionItemIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMentionSuggestionItemIconDrawableTintColor()Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3, p2}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->item:Lio/getstream/chat/android/models/User;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    const-string p0, "item"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->_init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/models/User;)V
    .locals 6

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->item:Lio/getstream/chat/android/models/User;

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;

    .line 6
    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const/4 v1, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v2, v1, v3}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder$bind$$inlined$doOnLayout$1;

    invoke-direct {v1, p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder$bind$$inlined$doOnLayout$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;Lio/getstream/chat/android/models/User;)V

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 9
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->mentionTemplateText:Ljava/lang/String;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "toLowerCase(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->usernameTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_1

    move-object v4, v0

    :cond_1
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->mentionNameTextView:Landroid/widget/TextView;

    const-string v4, "mentionNameTextView"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_2

    goto :goto_1

    :cond_2
    move v3, v2

    :goto_1
    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    const/16 v2, 0x8

    .line 12
    :goto_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 13
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;->mentionNameTextView:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final bridge synthetic bind(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->bind(Lio/getstream/chat/android/models/User;)V

    return-void
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;

    return-object v0
.end method

.method public final getMentionSelectionListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method
