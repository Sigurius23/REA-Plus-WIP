.class public final Lio/getstream/chat/android/models/Reaction$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/Reaction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0008J\u0010\u0010 \u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010!\u001a\u00020\u00002\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\"\u001a\u00020\u00002\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0010J\u0010\u0010#\u001a\u00020\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0010J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010%\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u0017J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\'\u001a\u00020\u00002\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0008J\u0006\u0010(\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Reaction$Builder;",
        "",
        "<init>",
        "()V",
        "reaction",
        "Lio/getstream/chat/android/models/Reaction;",
        "(Lio/getstream/chat/android/models/Reaction;)V",
        "messageId",
        "",
        "type",
        "score",
        "",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "userId",
        "createdAt",
        "Ljava/util/Date;",
        "createdLocallyAt",
        "updatedAt",
        "deletedAt",
        "syncStatus",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "extraData",
        "",
        "enforceUnique",
        "",
        "emojiCode",
        "withMessageId",
        "withType",
        "withScore",
        "withUser",
        "withUserId",
        "withCreatedAt",
        "withCreatedLocallyAt",
        "withUpdatedAt",
        "withDeletedAt",
        "withSyncStatus",
        "withExtraData",
        "withEnforceUnique",
        "withEmojiCode",
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
.field private createdAt:Ljava/util/Date;

.field private createdLocallyAt:Ljava/util/Date;

.field private deletedAt:Ljava/util/Date;

.field private emojiCode:Ljava/lang/String;

.field private enforceUnique:Z

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

.field private messageId:Ljava/lang/String;

.field private score:I

.field private syncStatus:Lio/getstream/chat/android/models/SyncStatus;

.field private type:Ljava/lang/String;

.field private updatedAt:Ljava/util/Date;

.field private user:Lio/getstream/chat/android/models/User;

.field private userId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->messageId:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->type:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->userId:Ljava/lang/String;

    .line 5
    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    .line 6
    sget-object v0, Lm83/z;->w:Lm83/z;

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->extraData:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/Reaction;)V
    .locals 1

    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Lio/getstream/chat/android/models/Reaction$Builder;-><init>()V

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->messageId:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->type:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getScore()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->score:I

    .line 11
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->user:Lio/getstream/chat/android/models/User;

    .line 12
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->userId:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->createdAt:Ljava/util/Date;

    .line 14
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->createdLocallyAt:Ljava/util/Date;

    .line 15
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->updatedAt:Ljava/util/Date;

    .line 16
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getDeletedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->deletedAt:Ljava/util/Date;

    .line 17
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    .line 18
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getExtraData()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->extraData:Ljava/util/Map;

    .line 19
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getEnforceUnique()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/Reaction$Builder;->enforceUnique:Z

    .line 20
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getEmojiCode()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->emojiCode:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/models/Reaction;
    .locals 18

    move-object/from16 v0, p0

    new-instance v1, Lio/getstream/chat/android/models/Reaction;

    iget-object v2, v0, Lio/getstream/chat/android/models/Reaction$Builder;->messageId:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/Reaction$Builder;->type:Ljava/lang/String;

    iget v4, v0, Lio/getstream/chat/android/models/Reaction$Builder;->score:I

    iget-object v5, v0, Lio/getstream/chat/android/models/Reaction$Builder;->user:Lio/getstream/chat/android/models/User;

    iget-object v6, v0, Lio/getstream/chat/android/models/Reaction$Builder;->userId:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/models/Reaction$Builder;->createdAt:Ljava/util/Date;

    iget-object v8, v0, Lio/getstream/chat/android/models/Reaction$Builder;->createdLocallyAt:Ljava/util/Date;

    iget-object v9, v0, Lio/getstream/chat/android/models/Reaction$Builder;->updatedAt:Ljava/util/Date;

    iget-object v10, v0, Lio/getstream/chat/android/models/Reaction$Builder;->deletedAt:Ljava/util/Date;

    iget-object v11, v0, Lio/getstream/chat/android/models/Reaction$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iget-object v12, v0, Lio/getstream/chat/android/models/Reaction$Builder;->extraData:Ljava/util/Map;

    invoke-static {v12}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v12

    iget-boolean v13, v0, Lio/getstream/chat/android/models/Reaction$Builder;->enforceUnique:Z

    iget-object v15, v0, Lio/getstream/chat/android/models/Reaction$Builder;->emojiCode:Ljava/lang/String;

    const/16 v16, 0x1000

    const/16 v17, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v1 .. v17}, Lio/getstream/chat/android/models/Reaction;-><init>(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final messageId(Ljava/lang/String;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->messageId:Ljava/lang/String;

    return-object p0
.end method

.method public final withCreatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->createdAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withCreatedLocallyAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->createdLocallyAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withDeletedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->deletedAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withEmojiCode(Ljava/lang/String;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->emojiCode:Ljava/lang/String;

    return-object p0
.end method

.method public final withEnforceUnique(Z)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->enforceUnique:Z

    return-object p0
.end method

.method public final withExtraData(Ljava/util/Map;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/Reaction$Builder;"
        }
    .end annotation

    const-string v0, "extraData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->extraData:Ljava/util/Map;

    return-object p0
.end method

.method public final withMessageId(Ljava/lang/String;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->messageId:Ljava/lang/String;

    return-object p0
.end method

.method public final withScore(I)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->score:I

    return-object p0
.end method

.method public final withSyncStatus(Lio/getstream/chat/android/models/SyncStatus;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 1

    const-string v0, "syncStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object p0
.end method

.method public final withType(Ljava/lang/String;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->type:Ljava/lang/String;

    return-object p0
.end method

.method public final withUpdatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->updatedAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withUser(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->user:Lio/getstream/chat/android/models/User;

    return-object p0
.end method

.method public final withUserId(Ljava/lang/String;)Lio/getstream/chat/android/models/Reaction$Builder;
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Reaction$Builder;->userId:Ljava/lang/String;

    return-object p0
.end method
