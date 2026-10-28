.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CommandStash"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;",
        "",
        "input",
        "",
        "attachments",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "recordingAttachment",
        "mentions",
        "",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Attachment;Ljava/util/Set;)V",
        "getInput",
        "()Ljava/lang/String;",
        "getAttachments",
        "()Ljava/util/Map;",
        "getRecordingAttachment",
        "()Lio/getstream/chat/android/models/Attachment;",
        "getMentions",
        "()Ljava/util/Set;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final attachments:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private final input:Ljava/lang/String;

.field private final mentions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;"
        }
    .end annotation
.end field

.field private final recordingAttachment:Lio/getstream/chat/android/models/Attachment;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Attachment;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->input:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->attachments:Ljava/util/Map;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->recordingAttachment:Lio/getstream/chat/android/models/Attachment;

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->mentions:Ljava/util/Set;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Attachment;Ljava/util/Set;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->input:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->attachments:Ljava/util/Map;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->recordingAttachment:Lio/getstream/chat/android/models/Attachment;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->mentions:Ljava/util/Set;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->copy(Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Attachment;Ljava/util/Set;)Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->input:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->attachments:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/models/Attachment;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->recordingAttachment:Lio/getstream/chat/android/models/Attachment;

    return-object v0
.end method

.method public final component4()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->mentions:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Attachment;Ljava/util/Set;)Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;-><init>(Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Attachment;Ljava/util/Set;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->input:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->input:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->attachments:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->attachments:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->recordingAttachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->recordingAttachment:Lio/getstream/chat/android/models/Attachment;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->mentions:Ljava/util/Set;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->mentions:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAttachments()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->attachments:Ljava/util/Map;

    return-object v0
.end method

.method public final getInput()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->input:Ljava/lang/String;

    return-object v0
.end method

.method public final getMentions()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->mentions:Ljava/util/Set;

    return-object v0
.end method

.method public final getRecordingAttachment()Lio/getstream/chat/android/models/Attachment;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->recordingAttachment:Lio/getstream/chat/android/models/Attachment;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->input:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->attachments:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->recordingAttachment:Lio/getstream/chat/android/models/Attachment;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->mentions:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->input:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->attachments:Ljava/util/Map;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->recordingAttachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;->mentions:Ljava/util/Set;

    const-string v4, ", attachments="

    const-string v5, ", recordingAttachment="

    const-string v6, "CommandStash(input="

    invoke-static {v6, v0, v4, v5, v1}, Lvl/b;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mentions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
