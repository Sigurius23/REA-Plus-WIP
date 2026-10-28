.class public final Lio/getstream/chat/android/models/MessageReminder$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/MessageReminder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0008J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0008J\u0006\u0010\u0019\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/models/MessageReminder$Builder;",
        "",
        "<init>",
        "()V",
        "reminder",
        "Lio/getstream/chat/android/models/MessageReminder;",
        "(Lio/getstream/chat/android/models/MessageReminder;)V",
        "remindAt",
        "Ljava/util/Date;",
        "cid",
        "",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "messageId",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "createdAt",
        "updatedAt",
        "withRemindAt",
        "withCid",
        "withChannel",
        "withMessageId",
        "withMessage",
        "withCreatedAt",
        "withUpdatedAt",
        "build",
        "stream-chat-android-core"
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
.field private channel:Lio/getstream/chat/android/models/Channel;

.field private cid:Ljava/lang/String;

.field private createdAt:Ljava/util/Date;

.field private message:Lio/getstream/chat/android/models/Message;

.field private messageId:Ljava/lang/String;

.field private remindAt:Ljava/util/Date;

.field private updatedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->cid:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->messageId:Ljava/lang/String;

    .line 4
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->createdAt:Ljava/util/Date;

    .line 5
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->updatedAt:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/MessageReminder;)V
    .locals 1

    const-string v0, "reminder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Lio/getstream/chat/android/models/MessageReminder$Builder;-><init>()V

    .line 7
    invoke-virtual {p1}, Lio/getstream/chat/android/models/MessageReminder;->getRemindAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->remindAt:Ljava/util/Date;

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/models/MessageReminder;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->message:Lio/getstream/chat/android/models/Message;

    .line 9
    invoke-virtual {p1}, Lio/getstream/chat/android/models/MessageReminder;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->channel:Lio/getstream/chat/android/models/Channel;

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/models/MessageReminder;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->createdAt:Ljava/util/Date;

    .line 11
    invoke-virtual {p1}, Lio/getstream/chat/android/models/MessageReminder;->getUpdatedAt()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->updatedAt:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/models/MessageReminder;
    .locals 8

    new-instance v0, Lio/getstream/chat/android/models/MessageReminder;

    iget-object v1, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->remindAt:Ljava/util/Date;

    iget-object v2, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->cid:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v4, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->messageId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->message:Lio/getstream/chat/android/models/Message;

    iget-object v6, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->createdAt:Ljava/util/Date;

    iget-object v7, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->updatedAt:Ljava/util/Date;

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/models/MessageReminder;-><init>(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/util/Date;Ljava/util/Date;)V

    return-object v0
.end method

.method public final withChannel(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/MessageReminder$Builder;
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->channel:Lio/getstream/chat/android/models/Channel;

    return-object p0
.end method

.method public final withCid(Ljava/lang/String;)Lio/getstream/chat/android/models/MessageReminder$Builder;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->cid:Ljava/lang/String;

    return-object p0
.end method

.method public final withCreatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/MessageReminder$Builder;
    .locals 1

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->createdAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/MessageReminder$Builder;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->message:Lio/getstream/chat/android/models/Message;

    return-object p0
.end method

.method public final withMessageId(Ljava/lang/String;)Lio/getstream/chat/android/models/MessageReminder$Builder;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->messageId:Ljava/lang/String;

    return-object p0
.end method

.method public final withRemindAt(Ljava/util/Date;)Lio/getstream/chat/android/models/MessageReminder$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->remindAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withUpdatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/MessageReminder$Builder;
    .locals 1

    const-string v0, "updatedAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/MessageReminder$Builder;->updatedAt:Ljava/util/Date;

    return-object p0
.end method
