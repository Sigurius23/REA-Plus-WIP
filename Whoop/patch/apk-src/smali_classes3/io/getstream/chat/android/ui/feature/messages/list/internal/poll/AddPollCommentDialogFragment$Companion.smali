.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "REQUEST_KEY",
        "BUNDLE_KEY_MESSAGE_ID",
        "BUNDLE_KEY_POLL_ID",
        "BUNDLE_KEY_ANSWER",
        "ARG_MESSAGE_ID",
        "ARG_POLL_ID",
        "ARG_INITIAL_TEXT",
        "newInstance",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;",
        "messageId",
        "pollId",
        "initialText",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic newInstance$default(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;->newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;
    .locals 3

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;-><init>()V

    new-instance v1, Ll83/k;

    const-string v2, "arg_message_id"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v2, "arg_poll_id"

    invoke-direct {p1, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    const-string v2, "arg_initial_text"

    invoke-direct {p2, v2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, p1, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
