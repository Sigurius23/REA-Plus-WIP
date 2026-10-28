.class public final Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000cH\u00c6\u0003JE\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH\u00c6\u0001J\u0013\u0010 \u001a\u00020\u000c2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0018\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
        "",
        "attachment",
        "Lio/getstream/chat/android/models/Attachment;",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "createdAt",
        "Ljava/util/Date;",
        "messageId",
        "",
        "cid",
        "isMine",
        "",
        "<init>",
        "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z)V",
        "getAttachment",
        "()Lio/getstream/chat/android/models/Attachment;",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getMessageId",
        "()Ljava/lang/String;",
        "getCid",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
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
.field private final attachment:Lio/getstream/chat/android/models/Attachment;

.field private final cid:Ljava/lang/String;

.field private final createdAt:Ljava/util/Date;

.field private final isMine:Z

.field private final messageId:Ljava/lang/String;

.field private final user:Lio/getstream/chat/android/models/User;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->attachment:Lio/getstream/chat/android/models/Attachment;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->user:Lio/getstream/chat/android/models/User;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->createdAt:Ljava/util/Date;

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->messageId:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->cid:Ljava/lang/String;

    iput-boolean p6, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->attachment:Lio/getstream/chat/android/models/Attachment;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->user:Lio/getstream/chat/android/models/User;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->createdAt:Ljava/util/Date;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->messageId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->cid:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->copy(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Attachment;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->attachment:Lio/getstream/chat/android/models/Attachment;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component3()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;
    .locals 8

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;-><init>(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->user:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->messageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->messageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAttachment()Lio/getstream/chat/android/models/Attachment;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->attachment:Lio/getstream/chat/android/models/Attachment;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v2, v0, v1}, Ld13/a;->b(Lio/getstream/chat/android/models/User;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->messageId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isMine()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->user:Lio/getstream/chat/android/models/User;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->createdAt:Ljava/util/Date;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->messageId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->cid:Ljava/lang/String;

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->isMine:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AttachmentGalleryItem(attachment="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", user="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cid="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isMine="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
