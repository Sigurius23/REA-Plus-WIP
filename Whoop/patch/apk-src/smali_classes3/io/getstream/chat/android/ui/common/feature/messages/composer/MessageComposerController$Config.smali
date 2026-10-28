.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Config"
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;",
        "",
        "maxAttachmentCount",
        "",
        "linkPreviewEnabled",
        "",
        "draftMessageEnabled",
        "activeCommandEnabled",
        "<init>",
        "(IZZZ)V",
        "getMaxAttachmentCount",
        "()I",
        "getLinkPreviewEnabled",
        "()Z",
        "getDraftMessageEnabled",
        "getActiveCommandEnabled",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final activeCommandEnabled:Z

.field private final draftMessageEnabled:Z

.field private final linkPreviewEnabled:Z

.field private final maxAttachmentCount:I


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->maxAttachmentCount:I

    .line 4
    iput-boolean p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->linkPreviewEnabled:Z

    .line 5
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->draftMessageEnabled:Z

    .line 6
    iput-boolean p4, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->activeCommandEnabled:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/16 p1, 0x1e

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;-><init>(IZZZ)V

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;IZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->maxAttachmentCount:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->linkPreviewEnabled:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->draftMessageEnabled:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->activeCommandEnabled:Z

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;-><init>(IZZZ)V

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->maxAttachmentCount:I

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->linkPreviewEnabled:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->draftMessageEnabled:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->activeCommandEnabled:Z

    return v0
.end method

.method public final copy(IZZZ)Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;-><init>(IZZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->maxAttachmentCount:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->maxAttachmentCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->linkPreviewEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->linkPreviewEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->draftMessageEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->draftMessageEnabled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->activeCommandEnabled:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->activeCommandEnabled:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getActiveCommandEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->activeCommandEnabled:Z

    return v0
.end method

.method public final getDraftMessageEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->draftMessageEnabled:Z

    return v0
.end method

.method public final getLinkPreviewEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->linkPreviewEnabled:Z

    return v0
.end method

.method public final getMaxAttachmentCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->maxAttachmentCount:I

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->maxAttachmentCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->linkPreviewEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->draftMessageEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->activeCommandEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->maxAttachmentCount:I

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->linkPreviewEnabled:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->draftMessageEnabled:Z

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;->activeCommandEnabled:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Config(maxAttachmentCount="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", linkPreviewEnabled="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", draftMessageEnabled="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", activeCommandEnabled="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
