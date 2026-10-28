.class public final Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;
.super Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Complete"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
        "attachment",
        "Lio/getstream/chat/android/models/Attachment;",
        "<init>",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "getAttachment",
        "()Lio/getstream/chat/android/models/Attachment;",
        "toString",
        "",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
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
.field private final attachment:Lio/getstream/chat/android/models/Attachment;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Attachment;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->attachment:Lio/getstream/chat/android/models/Attachment;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;Lio/getstream/chat/android/models/Attachment;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->attachment:Lio/getstream/chat/android/models/Attachment;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->copy(Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Attachment;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->attachment:Lio/getstream/chat/android/models/Attachment;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;-><init>(Lio/getstream/chat/android/models/Attachment;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAttachment()Lio/getstream/chat/android/models/Attachment;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->attachment:Lio/getstream/chat/android/models/Attachment;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getDuration(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Float;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Recording.Complete(duration="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", attachment="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
