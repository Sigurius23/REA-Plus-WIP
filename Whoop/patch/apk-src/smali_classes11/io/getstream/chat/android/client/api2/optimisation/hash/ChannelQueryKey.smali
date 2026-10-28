.class public final Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0080\u0008\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;",
        "",
        "channelType",
        "",
        "channelId",
        "queryKey",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)V",
        "getChannelType",
        "()Ljava/lang/String;",
        "getChannelId",
        "getQueryKey",
        "()Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;",
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
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey$Companion;


# instance fields
.field private final channelId:Ljava/lang/String;

.field private final channelType:Ljava/lang/String;

.field private final queryKey:Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->Companion:Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)V
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelType:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelId:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->queryKey:Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelType:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->queryKey:Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->copy(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->queryKey:Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->queryKey:Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->queryKey:Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getQueryKey()Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->queryKey:Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelType:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->queryKey:Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelType:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->channelId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/ChannelQueryKey;->queryKey:Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;

    const-string v3, ", channelId="

    const-string v4, ", queryKey="

    const-string v5, "ChannelQueryKey(channelType="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
