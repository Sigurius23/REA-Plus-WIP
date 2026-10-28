.class final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;
.super Landroidx/recyclerview/widget/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OptionDiffCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/u;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00c2\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;",
        "Landroidx/recyclerview/widget/u;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;",
        "<init>",
        "()V",
        "oldItem",
        "newItem",
        "",
        "areItemsTheSame",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)Z",
        "areContentsTheSame",
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final areContentsTheSame(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getDuplicateError()Z

    move-result p1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getDuplicateError()Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;->areContentsTheSame(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)Z

    move-result p1

    return p1
.end method

.method public final areItemsTheSame(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getId()I

    move-result p1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getId()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;->areItemsTheSame(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)Z

    move-result p1

    return p1
.end method
