.class public final Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0017\u0008\u0081\u0008\u0018\u00002\u00020\u0001BE\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003JG\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;",
        "",
        "watch",
        "",
        "reply_limit",
        "",
        "participant_limit",
        "member_limit",
        "limit",
        "next",
        "",
        "<init>",
        "(ZIIIILjava/lang/String;)V",
        "getWatch",
        "()Z",
        "getReply_limit",
        "()I",
        "getParticipant_limit",
        "getMember_limit",
        "getLimit",
        "getNext",
        "()Ljava/lang/String;",
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

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# instance fields
.field private final limit:I

.field private final member_limit:I

.field private final next:Ljava/lang/String;

.field private final participant_limit:I

.field private final reply_limit:I

.field private final watch:Z


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;-><init>(ZIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZIIIILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->watch:Z

    .line 4
    iput p2, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->reply_limit:I

    .line 5
    iput p3, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->participant_limit:I

    .line 6
    iput p4, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->member_limit:I

    .line 7
    iput p5, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->limit:I

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->next:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const/4 p2, 0x2

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/16 v0, 0x64

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    const/16 p5, 0xa

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    const/4 p6, 0x0

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    .line 9
    invoke-direct/range {p2 .. p8}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;-><init>(ZIIIILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;ZIIIILjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->watch:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->reply_limit:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->participant_limit:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->member_limit:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->limit:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->next:Ljava/lang/String;

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->copy(ZIIIILjava/lang/String;)Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->watch:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->reply_limit:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->participant_limit:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->member_limit:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->limit:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZIIIILjava/lang/String;)Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;
    .locals 7

    new-instance v0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;-><init>(ZIIIILjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->watch:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->watch:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->reply_limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->reply_limit:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->participant_limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->participant_limit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->member_limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->member_limit:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->limit:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->next:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->next:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->limit:I

    return v0
.end method

.method public final getMember_limit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->member_limit:I

    return v0
.end method

.method public final getNext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipant_limit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->participant_limit:I

    return v0
.end method

.method public final getReply_limit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->reply_limit:I

    return v0
.end method

.method public final getWatch()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->watch:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->watch:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->reply_limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->participant_limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->member_limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->next:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->watch:Z

    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->reply_limit:I

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->participant_limit:I

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->member_limit:I

    iget v4, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->limit:I

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;->next:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "GetThreadRequest(watch="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", reply_limit="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", participant_limit="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", member_limit="

    const-string v1, ", limit="

    invoke-static {v6, v2, v0, v3, v1}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v0, ", next="

    const-string v1, ")"

    invoke-static {v4, v0, v5, v1, v6}, Ly00/t7;->f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
