.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CommentItem"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;",
        "",
        "answer",
        "Lio/getstream/chat/android/models/Answer;",
        "showUser",
        "",
        "<init>",
        "(Lio/getstream/chat/android/models/Answer;Z)V",
        "getAnswer",
        "()Lio/getstream/chat/android/models/Answer;",
        "getShowUser",
        "()Z",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final answer:Lio/getstream/chat/android/models/Answer;

.field private final showUser:Z


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Answer;Z)V
    .locals 1

    const-string v0, "answer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->answer:Lio/getstream/chat/android/models/Answer;

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->showUser:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;Lio/getstream/chat/android/models/Answer;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->answer:Lio/getstream/chat/android/models/Answer;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->showUser:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->copy(Lio/getstream/chat/android/models/Answer;Z)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Answer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->answer:Lio/getstream/chat/android/models/Answer;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->showUser:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Answer;Z)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;
    .locals 1

    const-string v0, "answer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;-><init>(Lio/getstream/chat/android/models/Answer;Z)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->answer:Lio/getstream/chat/android/models/Answer;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->answer:Lio/getstream/chat/android/models/Answer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->showUser:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->showUser:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getAnswer()Lio/getstream/chat/android/models/Answer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->answer:Lio/getstream/chat/android/models/Answer;

    return-object v0
.end method

.method public final getShowUser()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->showUser:Z

    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->answer:Lio/getstream/chat/android/models/Answer;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Answer;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->showUser:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->answer:Lio/getstream/chat/android/models/Answer;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->showUser:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CommentItem(answer="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showUser="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
