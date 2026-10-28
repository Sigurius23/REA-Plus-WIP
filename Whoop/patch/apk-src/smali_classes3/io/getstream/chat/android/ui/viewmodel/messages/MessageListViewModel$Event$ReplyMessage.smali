.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;
.super Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ReplyMessage"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;",
        "cid",
        "",
        "repliedMessage",
        "Lio/getstream/chat/android/models/Message;",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V",
        "getCid",
        "()Ljava/lang/String;",
        "getRepliedMessage",
        "()Lio/getstream/chat/android/models/Message;",
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
.field private final cid:Ljava/lang/String;

.field private final repliedMessage:Lio/getstream/chat/android/models/Message;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repliedMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->cid:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->repliedMessage:Lio/getstream/chat/android/models/Message;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;Ljava/lang/String;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->cid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->repliedMessage:Lio/getstream/chat/android/models/Message;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->copy(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->repliedMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repliedMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->repliedMessage:Lio/getstream/chat/android/models/Message;

    iget-object p1, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->repliedMessage:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getRepliedMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->repliedMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->cid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->repliedMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->cid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->repliedMessage:Lio/getstream/chat/android/models/Message;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ReplyMessage(cid="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", repliedMessage="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
