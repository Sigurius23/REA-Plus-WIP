.class public final Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;
.super Lio/getstream/chat/android/client/events/ChatEvent;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "type",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "rawCreatedAt",
        "draftMessage",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)V",
        "getType",
        "()Ljava/lang/String;",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getRawCreatedAt",
        "getDraftMessage",
        "()Lio/getstream/chat/android/models/DraftMessage;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "stream-chat-android-client_release"
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
.field private final createdAt:Ljava/util/Date;

.field private final draftMessage:Lio/getstream/chat/android/models/DraftMessage;

.field private final rawCreatedAt:Ljava/lang/String;

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawCreatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "draftMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/events/ChatEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->type:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->createdAt:Ljava/util/Date;

    iput-object p3, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->rawCreatedAt:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->createdAt:Ljava/util/Date;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->rawCreatedAt:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawCreatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "draftMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;

    iget-object v1, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    iget-object p1, p1, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    return-object v0
.end method

.method public final getRawCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/DraftMessage;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->createdAt:Ljava/util/Date;

    iget-object v2, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->draftMessage:Lio/getstream/chat/android/models/DraftMessage;

    const-string v4, ", createdAt="

    const-string v5, ", rawCreatedAt="

    const-string v6, "DraftMessageDeletedEvent(type="

    invoke-static {v6, v0, v4, v1, v5}, Lc13/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", draftMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
