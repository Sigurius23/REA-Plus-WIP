.class final Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;
.super Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder<",
        "Lio/getstream/chat/android/models/Command;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0010R\u0016\u0010\u000c\u001a\u00020\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00028CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;",
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;",
        "Lio/getstream/chat/android/models/Command;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "style",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "commandSelectionListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V",
        "item",
        "bind",
        "(Lio/getstream/chat/android/models/Command;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/models/Command;",
        "",
        "commandTemplateText",
        "Ljava/lang/String;",
        "",
        "getImageRes",
        "(Lio/getstream/chat/android/models/Command;)I",
        "imageRes",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;

.field private final commandSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final commandTemplateText:Ljava/lang/String;

.field private item:Lio/getstream/chat/android/models/Command;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;",
            "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSelectionListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getCommandSuggestionItemCommandDescriptionText()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->commandTemplateText:Ljava/lang/String;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;->commandNameTextView:Landroid/widget/TextView;

    const-string v0, "commandNameTextView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getCommandSuggestionItemCommandNameTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p3, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object p3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;->commandQueryTextView:Landroid/widget/TextView;

    const-string v0, "commandQueryTextView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getCommandSuggestionItemCommandDescriptionTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    invoke-static {p3, p2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;->instantCommandImageView:Landroid/widget/ImageView;

    const-string p2, "instantCommandImageView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->item:Lio/getstream/chat/android/models/Command;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    const-string p0, "item"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->_init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private final getImageRes(Lio/getstream/chat/android/models/Command;)I
    .locals 1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "mute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lio/getstream/chat/android/ui/common/R$drawable;->stream_design_ic_mute:I

    return p1

    :cond_0
    const-string v0, "unmute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_command_unmute:I

    return p1

    :cond_1
    sget p1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_giphy:I

    return p1
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/models/Command;)V
    .locals 5

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->item:Lio/getstream/chat/android/models/Command;

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;->commandIconImageView:Landroid/widget/ImageView;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->getImageRes(Lio/getstream/chat/android/models/Command;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;->commandNameTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toUpperCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "substring(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;->commandQueryTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->commandTemplateText:Ljava/lang/String;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Command;->getArgs()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x2

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final bridge synthetic bind(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/models/Command;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->bind(Lio/getstream/chat/android/models/Command;)V

    return-void
.end method
