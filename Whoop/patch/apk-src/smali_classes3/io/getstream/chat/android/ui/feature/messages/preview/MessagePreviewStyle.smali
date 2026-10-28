.class public final Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "",
        "messageSenderTextStyle",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "messageTextStyle",
        "messageTimeTextStyle",
        "<init>",
        "(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V",
        "getMessageSenderTextStyle",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "getMessageTextStyle",
        "getMessageTimeTextStyle",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
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
.field private final messageSenderTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final messageTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final messageTimeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 1

    const-string v0, "messageSenderTextStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageTextStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageTimeTextStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageSenderTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTimeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageSenderTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTimeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->copy(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageSenderTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTimeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;
    .locals 1

    const-string v0, "messageSenderTextStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageTextStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageTimeTextStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;-><init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageSenderTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageSenderTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTimeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTimeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMessageSenderTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageSenderTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getMessageTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getMessageTimeTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTimeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageSenderTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTimeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageSenderTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->messageTimeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "MessagePreviewStyle(messageSenderTextStyle="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageTextStyle="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageTimeTextStyle="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
