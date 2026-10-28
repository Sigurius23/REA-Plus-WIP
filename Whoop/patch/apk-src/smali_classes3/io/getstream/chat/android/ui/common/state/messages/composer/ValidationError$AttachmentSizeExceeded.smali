.class public final Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;
.super Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AttachmentSizeExceeded"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
        "attachments",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "maxAttachmentSize",
        "",
        "<init>",
        "(Ljava/util/List;J)V",
        "getAttachments",
        "()Ljava/util/List;",
        "getMaxAttachmentSize",
        "()J",
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
.field private final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private final maxAttachmentSize:J


# direct methods
.method public constructor <init>(Ljava/util/List;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;J)V"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->attachments:Ljava/util/List;

    iput-wide p2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->maxAttachmentSize:J

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;Ljava/util/List;JILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->attachments:Ljava/util/List;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->maxAttachmentSize:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->copy(Ljava/util/List;J)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->maxAttachmentSize:J

    return-wide v0
.end method

.method public final copy(Ljava/util/List;J)Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;J)",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;-><init>(Ljava/util/List;J)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->attachments:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->attachments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->maxAttachmentSize:J

    iget-wide v5, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->maxAttachmentSize:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getAttachments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final getMaxAttachmentSize()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->maxAttachmentSize:J

    return-wide v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->attachments:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->maxAttachmentSize:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->attachments:Ljava/util/List;

    iget-wide v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->maxAttachmentSize:J

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "AttachmentSizeExceeded(attachments="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", maxAttachmentSize="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
