.class public final Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;",
        "",
        "messageId",
        "",
        "firstId",
        "limit",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;I)V",
        "getMessageId",
        "()Ljava/lang/String;",
        "getFirstId",
        "getLimit",
        "()I",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
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
.field private final firstId:Ljava/lang/String;

.field private final limit:I

.field private final messageId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->messageId:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->firstId:Ljava/lang/String;

    iput p3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->limit:I

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->messageId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->firstId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->limit:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->copy(Ljava/lang/String;Ljava/lang/String;I)Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->firstId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->limit:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;I)Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->messageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->messageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->firstId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->firstId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->limit:I

    iget p1, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->limit:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getFirstId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->firstId:Ljava/lang/String;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->limit:I

    return v0
.end method

.method public final getMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->messageId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->firstId:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->limit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->messageId:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->firstId:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;->limit:I

    const-string v3, ", firstId="

    const-string v4, ", limit="

    const-string v5, "GetRepliesHash(messageId="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
