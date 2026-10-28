.class public final Lio/getstream/chat/android/client/api/models/GetThreadOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0000\u00a2\u0006\u0002\u0008\u0013J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/GetThreadOptions;",
        "",
        "watch",
        "",
        "replyLimit",
        "",
        "participantLimit",
        "memberLimit",
        "<init>",
        "(ZIII)V",
        "getWatch",
        "()Z",
        "getReplyLimit",
        "()I",
        "getParticipantLimit",
        "getMemberLimit",
        "toMap",
        "",
        "",
        "toMap$stream_chat_android_client_release",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final memberLimit:I

.field private final participantLimit:I

.field private final replyLimit:I

.field private final watch:Z


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

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/api/models/GetThreadOptions;-><init>(ZIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 7

    .line 2
    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/api/models/GetThreadOptions;-><init>(ZIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 7

    .line 3
    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/api/models/GetThreadOptions;-><init>(ZIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZII)V
    .locals 7

    .line 4
    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/api/models/GetThreadOptions;-><init>(ZIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZIII)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->watch:Z

    .line 7
    iput p2, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->replyLimit:I

    .line 8
    iput p3, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->participantLimit:I

    .line 9
    iput p4, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->memberLimit:I

    return-void
.end method

.method public synthetic constructor <init>(ZIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/16 v0, 0x64

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 10
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/models/GetThreadOptions;-><init>(ZIII)V

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/client/api/models/GetThreadOptions;ZIIIILjava/lang/Object;)Lio/getstream/chat/android/client/api/models/GetThreadOptions;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->watch:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->replyLimit:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->participantLimit:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->memberLimit:I

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/models/GetThreadOptions;-><init>(ZIII)V

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->watch:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->replyLimit:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->participantLimit:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->memberLimit:I

    return v0
.end method

.method public final copy(ZIII)Lio/getstream/chat/android/client/api/models/GetThreadOptions;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/models/GetThreadOptions;-><init>(ZIII)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api/models/GetThreadOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api/models/GetThreadOptions;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->watch:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->watch:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->replyLimit:I

    iget v3, p1, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->replyLimit:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->participantLimit:I

    iget v3, p1, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->participantLimit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->memberLimit:I

    iget p1, p1, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->memberLimit:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMemberLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->memberLimit:I

    return v0
.end method

.method public final getParticipantLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->participantLimit:I

    return v0
.end method

.method public final getReplyLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->replyLimit:I

    return v0
.end method

.method public final getWatch()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->watch:Z

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->watch:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->replyLimit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->participantLimit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->memberLimit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toMap$stream_chat_android_client_release()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->watch:Z

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "watch"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->replyLimit:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "reply_limit"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->participantLimit:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "participant_limit"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->memberLimit:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "member_limit"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->watch:Z

    iget v1, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->replyLimit:I

    iget v2, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->participantLimit:I

    iget v3, p0, Lio/getstream/chat/android/client/api/models/GetThreadOptions;->memberLimit:I

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "GetThreadOptions(watch="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", replyLimit="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", participantLimit="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", memberLimit="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
