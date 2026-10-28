.class public final Lio/getstream/chat/android/models/ThreadParticipant;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/UserEntity;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/models/ThreadParticipant;",
        "Lio/getstream/chat/android/models/UserEntity;",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "lastThreadMessageAt",
        "Ljava/util/Date;",
        "<init>",
        "(Lio/getstream/chat/android/models/User;Ljava/util/Date;)V",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "getLastThreadMessageAt",
        "()Ljava/util/Date;",
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
.field private final lastThreadMessageAt:Ljava/util/Date;

.field private final user:Lio/getstream/chat/android/models/User;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/models/ThreadParticipant;->user:Lio/getstream/chat/android/models/User;

    iput-object p2, p0, Lio/getstream/chat/android/models/ThreadParticipant;->lastThreadMessageAt:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/ThreadParticipant;Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ThreadParticipant;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/models/ThreadParticipant;->user:Lio/getstream/chat/android/models/User;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/models/ThreadParticipant;->lastThreadMessageAt:Ljava/util/Date;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/models/ThreadParticipant;->copy(Lio/getstream/chat/android/models/User;Ljava/util/Date;)Lio/getstream/chat/android/models/ThreadParticipant;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadParticipant;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadParticipant;->lastThreadMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/User;Ljava/util/Date;)Lio/getstream/chat/android/models/ThreadParticipant;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/ThreadParticipant;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/models/ThreadParticipant;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/ThreadParticipant;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/ThreadParticipant;

    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadParticipant;->user:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadParticipant;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadParticipant;->lastThreadMessageAt:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/models/ThreadParticipant;->lastThreadMessageAt:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLastThreadMessageAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadParticipant;->lastThreadMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public getUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadParticipant;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lio/getstream/chat/android/models/UserEntity;->getUserId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadParticipant;->user:Lio/getstream/chat/android/models/User;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadParticipant;->lastThreadMessageAt:Ljava/util/Date;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadParticipant;->user:Lio/getstream/chat/android/models/User;

    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadParticipant;->lastThreadMessageAt:Ljava/util/Date;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ThreadParticipant(user="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastThreadMessageAt="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
