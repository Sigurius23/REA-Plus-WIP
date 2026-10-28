.class public final Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;
.super Lio/getstream/chat/android/ui/common/state/messages/MessageMode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/messages/MessageMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MessageThread"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001d\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
        "parentMessage",
        "Lio/getstream/chat/android/models/Message;",
        "threadState",
        "Lio/getstream/chat/android/client/api/state/ThreadState;",
        "<init>",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;)V",
        "getParentMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "getThreadState",
        "()Lio/getstream/chat/android/client/api/state/ThreadState;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final parentMessage:Lio/getstream/chat/android/models/Message;

.field private final threadState:Lio/getstream/chat/android/client/api/state/ThreadState;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    .line 1
    const-string v0, "parentMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;)V
    .locals 1

    const-string v0, "parentMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->parentMessage:Lio/getstream/chat/android/models/Message;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->threadState:Lio/getstream/chat/android/client/api/state/ThreadState;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->parentMessage:Lio/getstream/chat/android/models/Message;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->threadState:Lio/getstream/chat/android/client/api/state/ThreadState;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->copy(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;)Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->parentMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/client/api/state/ThreadState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->threadState:Lio/getstream/chat/android/client/api/state/ThreadState;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;)Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;
    .locals 1

    const-string v0, "parentMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->parentMessage:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->parentMessage:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->threadState:Lio/getstream/chat/android/client/api/state/ThreadState;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->threadState:Lio/getstream/chat/android/client/api/state/ThreadState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getParentMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->parentMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getThreadState()Lio/getstream/chat/android/client/api/state/ThreadState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->threadState:Lio/getstream/chat/android/client/api/state/ThreadState;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->parentMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->threadState:Lio/getstream/chat/android/client/api/state/ThreadState;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->parentMessage:Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->threadState:Lio/getstream/chat/android/client/api/state/ThreadState;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MessageThread(parentMessage="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", threadState="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
