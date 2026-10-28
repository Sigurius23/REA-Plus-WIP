.class public final Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;",
        "",
        "poll",
        "Lio/getstream/chat/android/models/Poll;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "pollSelectionType",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;",
        "<init>",
        "(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)V",
        "getPoll",
        "()Lio/getstream/chat/android/models/Poll;",
        "getMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "getPollSelectionType",
        "()Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I


# instance fields
.field private final message:Lio/getstream/chat/android/models/Message;

.field private final poll:Lio/getstream/chat/android/models/Poll;

.field private final pollSelectionType:Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)V
    .locals 1

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollSelectionType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->poll:Lio/getstream/chat/android/models/Poll;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->message:Lio/getstream/chat/android/models/Message;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->pollSelectionType:Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->poll:Lio/getstream/chat/android/models/Poll;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->message:Lio/getstream/chat/android/models/Message;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->pollSelectionType:Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->copy(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Poll;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->poll:Lio/getstream/chat/android/models/Poll;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->message:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->pollSelectionType:Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;
    .locals 1

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollSelectionType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;-><init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->poll:Lio/getstream/chat/android/models/Poll;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->message:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->message:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->pollSelectionType:Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->pollSelectionType:Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->message:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getPoll()Lio/getstream/chat/android/models/Poll;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->poll:Lio/getstream/chat/android/models/Poll;

    return-object v0
.end method

.method public final getPollSelectionType()Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->pollSelectionType:Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->pollSelectionType:Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->poll:Lio/getstream/chat/android/models/Poll;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->message:Lio/getstream/chat/android/models/Message;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;->pollSelectionType:Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SelectedPoll(poll="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", message="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollSelectionType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
