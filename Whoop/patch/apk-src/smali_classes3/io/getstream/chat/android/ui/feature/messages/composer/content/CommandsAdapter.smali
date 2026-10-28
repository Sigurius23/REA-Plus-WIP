.class final Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandsAdapter;
.super Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandSuggestionsAdapter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter<",
        "Lio/getstream/chat/android/models/Command;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;",
        ">;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandSuggestionsAdapter;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandsAdapter;",
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;",
        "Lio/getstream/chat/android/models/Command;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandSuggestionsAdapter;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "style",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "commandSelectionListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "Lkotlin/jvm/functions/Function1;",
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
.field private final commandSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSelectionListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandsAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandsAdapter;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;

    move-result-object p1

    .line 3
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandsAdapter;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandsAdapter;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-direct {p2, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V

    return-object p2
.end method
