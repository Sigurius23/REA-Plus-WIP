.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;
.super Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ChannelItem"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J/\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "typingUsers",
        "",
        "Lio/getstream/chat/android/models/User;",
        "draftMessage",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "<init>",
        "(Lio/getstream/chat/android/models/Channel;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;)V",
        "getChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "getTypingUsers",
        "()Ljava/util/List;",
        "getDraftMessage",
        "()Lio/getstream/chat/android/models/DraftMessage;",
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
.field private final channel:Lio/getstream/chat/android/models/Channel;

.field private final draftMessage:Lio/getstream/chat/android/models/DraftMessage;

.field private final typingUsers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Channel;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ")V"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typingUsers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->channel:Lio/getstream/chat/android/models/Channel;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->typingUsers:Ljava/util/List;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->channel:Lio/getstream/chat/android/models/Channel;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->typingUsers:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->copy(Lio/getstream/chat/android/models/Channel;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->typingUsers:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Channel;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ")",
            "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typingUsers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;-><init>(Lio/getstream/chat/android/models/Channel;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->typingUsers:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->typingUsers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getChannel()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    return-object v0
.end method

.method public final getTypingUsers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->typingUsers:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->typingUsers:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/DraftMessage;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->typingUsers:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ChannelItem(channel="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", typingUsers="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", draftMessage="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
