.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;,
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001b\u001cB+\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bB#\u0008\u0016\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0019R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;",
        "",
        "optionTextLimit",
        "Lkotlin/Function2;",
        "",
        "Ll83/a0;",
        "onOptionChange",
        "<init>",
        "(Ljava/lang/Integer;Lc93/m;)V",
        "(Lc93/m;)V",
        "position",
        "",
        "getItemId",
        "(I)J",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;",
        "holder",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;I)V",
        "Ljava/lang/Integer;",
        "Lc93/m;",
        "OptionViewHolder",
        "OptionDiffCallback",
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
.field private final onOptionChange:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final optionTextLimit:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "onOptionChange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;-><init>(Ljava/lang/Integer;Lc93/m;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "onOptionChange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;->optionTextLimit:Ljava/lang/Integer;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;->onOptionChange:Lc93/m;

    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/i1;->setHasStableIds(Z)V

    return-void
.end method


# virtual methods
.method public final getItemId(I)J
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getId()I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;->bind(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;
    .locals 7

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;

    .line 3
    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;->optionTextLimit:Ljava/lang/Integer;

    .line 4
    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;->onOptionChange:Lc93/m;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    .line 5
    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;Ljava/lang/Integer;Lc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
