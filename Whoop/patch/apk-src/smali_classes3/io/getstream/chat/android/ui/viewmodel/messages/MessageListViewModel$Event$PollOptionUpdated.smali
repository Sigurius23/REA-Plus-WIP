.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;
.super Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PollOptionUpdated"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "poll",
        "Lio/getstream/chat/android/models/Poll;",
        "option",
        "Lio/getstream/chat/android/models/Option;",
        "<init>",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V",
        "getMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "getPoll",
        "()Lio/getstream/chat/android/models/Poll;",
        "getOption",
        "()Lio/getstream/chat/android/models/Option;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
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
.field private final message:Lio/getstream/chat/android/models/Message;

.field private final option:Lio/getstream/chat/android/models/Option;

.field private final poll:Lio/getstream/chat/android/models/Poll;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poll"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->message:Lio/getstream/chat/android/models/Message;

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->poll:Lio/getstream/chat/android/models/Poll;

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->option:Lio/getstream/chat/android/models/Option;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->message:Lio/getstream/chat/android/models/Message;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->poll:Lio/getstream/chat/android/models/Poll;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->option:Lio/getstream/chat/android/models/Option;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->copy(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->message:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/Poll;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->poll:Lio/getstream/chat/android/models/Poll;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/models/Option;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->option:Lio/getstream/chat/android/models/Option;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poll"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->message:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->message:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->poll:Lio/getstream/chat/android/models/Poll;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->option:Lio/getstream/chat/android/models/Option;

    iget-object p1, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->option:Lio/getstream/chat/android/models/Option;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->message:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getOption()Lio/getstream/chat/android/models/Option;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->option:Lio/getstream/chat/android/models/Option;

    return-object v0
.end method

.method public final getPoll()Lio/getstream/chat/android/models/Poll;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->poll:Lio/getstream/chat/android/models/Poll;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->option:Lio/getstream/chat/android/models/Option;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Option;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->message:Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->poll:Lio/getstream/chat/android/models/Poll;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->option:Lio/getstream/chat/android/models/Option;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PollOptionUpdated(message="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", poll="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", option="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
