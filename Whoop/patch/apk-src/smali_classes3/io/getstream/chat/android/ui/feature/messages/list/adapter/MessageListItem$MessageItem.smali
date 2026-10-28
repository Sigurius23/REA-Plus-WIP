.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MessageItem"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u001c\u001a\u00020\u001dH\u0000\u00a2\u0006\u0002\u0008\u001eJ\u0008\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003Ji\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010+\u001a\u00020\u00072\u0008\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0016R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0016R\u0011\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0016\u00a8\u00061"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "position",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;",
        "isMine",
        "",
        "messageReadBy",
        "",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "isThreadMode",
        "isMessageRead",
        "isMessageDelivered",
        "showMessageFooter",
        "showOriginalText",
        "<init>",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZ)V",
        "getMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "getPosition",
        "()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;",
        "()Z",
        "getMessageReadBy",
        "()Ljava/util/List;",
        "getShowMessageFooter",
        "getShowOriginalText",
        "isTheirs",
        "uniqueIdentifier",
        "",
        "uniqueIdentifier$stream_chat_android_ui_components_release",
        "stringify",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
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
.field private final isMessageDelivered:Z

.field private final isMessageRead:Z

.field private final isMine:Z

.field private final isThreadMode:Z

.field private final message:Lio/getstream/chat/android/models/Message;

.field private final messageReadBy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation
.end field

.field private final position:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

.field private final showMessageFooter:Z

.field private final showOriginalText:Z


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;ZZZZZ)V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageReadBy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->position:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    .line 4
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine:Z

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->messageReadBy:Ljava/util/List;

    .line 6
    iput-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode:Z

    .line 7
    iput-boolean p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead:Z

    .line 8
    iput-boolean p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageDelivered:Z

    .line 9
    iput-boolean p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showMessageFooter:Z

    .line 10
    iput-boolean p9, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showOriginalText:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 11
    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->NONE:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    .line 12
    sget-object v4, Lm83/y;->w:Lm83/y;

    goto :goto_2

    :cond_2
    move-object v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_3

    move v5, v3

    goto :goto_3

    :cond_3
    move v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_4

    const/4 v6, 0x1

    goto :goto_4

    :cond_4
    move v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_5

    move v7, v3

    goto :goto_5

    :cond_5
    move/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_6

    move v8, v3

    goto :goto_6

    :cond_6
    move/from16 v8, p8

    :goto_6
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_7

    move/from16 p11, v3

    :goto_7
    move-object p2, p0

    move-object p3, p1

    move-object p4, v1

    move p5, v2

    move-object p6, v4

    move/from16 p7, v5

    move/from16 p8, v6

    move/from16 p9, v7

    move/from16 p10, v8

    goto :goto_8

    :cond_7
    move/from16 p11, p9

    goto :goto_7

    .line 13
    :goto_8
    invoke-direct/range {p2 .. p11}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->position:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine:Z

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->messageReadBy:Ljava/util/List;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode:Z

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead:Z

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-boolean p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageDelivered:Z

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-boolean p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showMessageFooter:Z

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showOriginalText:Z

    :cond_8
    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->copy(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZ)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->position:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine:Z

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->messageReadBy:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageDelivered:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showMessageFooter:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showOriginalText:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZ)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;ZZZZZ)",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageReadBy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZ)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->position:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->position:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->messageReadBy:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->messageReadBy:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageDelivered:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageDelivered:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showMessageFooter:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showMessageFooter:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showOriginalText:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showOriginalText:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getMessageReadBy()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->messageReadBy:Ljava/util/List;

    return-object v0
.end method

.method public final getPosition()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->position:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    return-object v0
.end method

.method public final getShowMessageFooter()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showMessageFooter:Z

    return v0
.end method

.method public final getShowOriginalText()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showOriginalText:Z

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->position:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->messageReadBy:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageDelivered:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showMessageFooter:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showOriginalText:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isMessageDelivered()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageDelivered:Z

    return v0
.end method

.method public final isMessageRead()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead:Z

    return v0
.end method

.method public final isMine()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine:Z

    return v0
.end method

.method public final isTheirs()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isThreadMode()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode:Z

    return v0
.end method

.method public final stringify()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessageItem(message="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->position:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine:Z

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->messageReadBy:Ljava/util/List;

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode:Z

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead:Z

    iget-boolean v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageDelivered:Z

    iget-boolean v7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showMessageFooter:Z

    iget-boolean v8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->showOriginalText:Z

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "MessageItem(message="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", position="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isMine="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", messageReadBy="

    const-string v1, ", isThreadMode="

    invoke-static {v0, v1, v9, v3, v2}, Lm4/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v0, ", isMessageRead="

    const-string v1, ", isMessageDelivered="

    invoke-static {v9, v4, v0, v5, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", showMessageFooter="

    const-string v1, ", showOriginalText="

    invoke-static {v9, v6, v0, v7, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final uniqueIdentifier$stream_chat_android_ui_components_release()J
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->identifierHash()J

    move-result-wide v0

    return-wide v0
.end method
