.class public final Lio/getstream/chat/android/models/DraftMessage$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/DraftMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0008J\u0010\u0010\u001c\u001a\u00020\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008J\u0014\u0010\u001d\u001a\u00020\u00002\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rJ\u0014\u0010\u001e\u001a\u00020\u00002\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\rJ\u001a\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u0011J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\"\u001a\u00020\u00002\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010#\u001a\u00020\u00002\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0008J\u0010\u0010$\u001a\u00020\u00002\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0008J\u0006\u0010%\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/models/DraftMessage$Builder;",
        "",
        "<init>",
        "()V",
        "message",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "(Lio/getstream/chat/android/models/DraftMessage;)V",
        "id",
        "",
        "cid",
        "text",
        "parentId",
        "attachments",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "mentionedUsersIds",
        "extraData",
        "",
        "silent",
        "",
        "showInChannel",
        "replyMessage",
        "Lio/getstream/chat/android/models/Message;",
        "command",
        "args",
        "withId",
        "withCid",
        "withText",
        "withParentId",
        "withAttachments",
        "withMentionedUsersIds",
        "withExtraData",
        "withSilent",
        "withShowInChannel",
        "withReplyMessage",
        "withCommand",
        "withArgs",
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
.field private args:Ljava/lang/String;

.field private attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private cid:Ljava/lang/String;

.field private command:Ljava/lang/String;

.field private extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private mentionedUsersIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private parentId:Ljava/lang/String;

.field private replyMessage:Lio/getstream/chat/android/models/Message;

.field private showInChannel:Z

.field private silent:Z

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->id:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->cid:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->text:Ljava/lang/String;

    .line 5
    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->attachments:Ljava/util/List;

    .line 6
    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->mentionedUsersIds:Ljava/util/List;

    .line 7
    sget-object v0, Lm83/z;->w:Lm83/z;

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->extraData:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/DraftMessage;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Lio/getstream/chat/android/models/DraftMessage$Builder;-><init>()V

    .line 9
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->id:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getCid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->cid:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->text:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getParentId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->parentId:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getAttachments()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->attachments:Ljava/util/List;

    .line 14
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getMentionedUsersIds()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->mentionedUsersIds:Ljava/util/List;

    .line 15
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getExtraData()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->extraData:Ljava/util/Map;

    .line 16
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getSilent()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->silent:Z

    .line 17
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getShowInChannel()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->showInChannel:Z

    .line 18
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getReplyMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->replyMessage:Lio/getstream/chat/android/models/Message;

    .line 19
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getCommand()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->command:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getArgs()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->args:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/models/DraftMessage;
    .locals 13

    new-instance v0, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->id:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->cid:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->text:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->parentId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->attachments:Ljava/util/List;

    iget-object v6, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->mentionedUsersIds:Ljava/util/List;

    iget-object v7, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->extraData:Ljava/util/Map;

    iget-boolean v8, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->silent:Z

    iget-boolean v9, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->showInChannel:Z

    iget-object v10, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->replyMessage:Lio/getstream/chat/android/models/Message;

    iget-object v11, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->command:Ljava/lang/String;

    iget-object v12, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->args:Ljava/lang/String;

    invoke-direct/range {v0 .. v12}, Lio/getstream/chat/android/models/DraftMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final withArgs(Ljava/lang/String;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->args:Ljava/lang/String;

    return-object p0
.end method

.method public final withAttachments(Ljava/util/List;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Lio/getstream/chat/android/models/DraftMessage$Builder;"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->attachments:Ljava/util/List;

    return-object p0
.end method

.method public final withCid(Ljava/lang/String;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->cid:Ljava/lang/String;

    return-object p0
.end method

.method public final withCommand(Ljava/lang/String;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->command:Ljava/lang/String;

    return-object p0
.end method

.method public final withExtraData(Ljava/util/Map;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/DraftMessage$Builder;"
        }
    .end annotation

    const-string v0, "extraData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->extraData:Ljava/util/Map;

    return-object p0
.end method

.method public final withId(Ljava/lang/String;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method public final withMentionedUsersIds(Ljava/util/List;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/DraftMessage$Builder;"
        }
    .end annotation

    const-string v0, "mentionedUsersIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->mentionedUsersIds:Ljava/util/List;

    return-object p0
.end method

.method public final withParentId(Ljava/lang/String;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->parentId:Ljava/lang/String;

    return-object p0
.end method

.method public final withReplyMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->replyMessage:Lio/getstream/chat/android/models/Message;

    return-object p0
.end method

.method public final withShowInChannel(Z)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->showInChannel:Z

    return-object p0
.end method

.method public final withSilent(Z)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->silent:Z

    return-object p0
.end method

.method public final withText(Ljava/lang/String;)Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage$Builder;->text:Ljava/lang/String;

    return-object p0
.end method
