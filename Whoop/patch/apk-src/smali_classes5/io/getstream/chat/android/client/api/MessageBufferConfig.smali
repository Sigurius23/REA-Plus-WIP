.class public final Lio/getstream/chat/android/client/api/MessageBufferConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B+\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0008H\u00c6\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/MessageBufferConfig;",
        "",
        "channelTypes",
        "",
        "",
        "capacity",
        "",
        "overflow",
        "Lio/getstream/chat/android/client/api/MessageBufferOverflow;",
        "<init>",
        "(Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;)V",
        "getChannelTypes",
        "()Ljava/util/Set;",
        "getCapacity",
        "()I",
        "getOverflow",
        "()Lio/getstream/chat/android/client/api/MessageBufferOverflow;",
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
.field private final capacity:I

.field private final channelTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final overflow:Lio/getstream/chat/android/client/api/MessageBufferOverflow;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/api/MessageBufferConfig;-><init>(Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;I",
            "Lio/getstream/chat/android/client/api/MessageBufferOverflow;",
            ")V"
        }
    .end annotation

    const-string v0, "channelTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overflow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->channelTypes:Ljava/util/Set;

    .line 4
    iput p2, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->capacity:I

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->overflow:Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    sget-object p1, Lm83/a0;->w:Lm83/a0;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const p2, 0x7fffffff

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    sget-object p3, Lio/getstream/chat/android/client/api/MessageBufferOverflow;->DROP_OLDEST:Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/MessageBufferConfig;-><init>(Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api/MessageBufferConfig;Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;ILjava/lang/Object;)Lio/getstream/chat/android/client/api/MessageBufferConfig;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->channelTypes:Ljava/util/Set;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->capacity:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->overflow:Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/MessageBufferConfig;->copy(Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;)Lio/getstream/chat/android/client/api/MessageBufferConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->channelTypes:Ljava/util/Set;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->capacity:I

    return v0
.end method

.method public final component3()Lio/getstream/chat/android/client/api/MessageBufferOverflow;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->overflow:Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    return-object v0
.end method

.method public final copy(Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;)Lio/getstream/chat/android/client/api/MessageBufferConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;I",
            "Lio/getstream/chat/android/client/api/MessageBufferOverflow;",
            ")",
            "Lio/getstream/chat/android/client/api/MessageBufferConfig;"
        }
    .end annotation

    const-string v0, "channelTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overflow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api/MessageBufferConfig;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/MessageBufferConfig;-><init>(Ljava/util/Set;ILio/getstream/chat/android/client/api/MessageBufferOverflow;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api/MessageBufferConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api/MessageBufferConfig;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->channelTypes:Ljava/util/Set;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/MessageBufferConfig;->channelTypes:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->capacity:I

    iget v3, p1, Lio/getstream/chat/android/client/api/MessageBufferConfig;->capacity:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->overflow:Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    iget-object p1, p1, Lio/getstream/chat/android/client/api/MessageBufferConfig;->overflow:Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCapacity()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->capacity:I

    return v0
.end method

.method public final getChannelTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->channelTypes:Ljava/util/Set;

    return-object v0
.end method

.method public final getOverflow()Lio/getstream/chat/android/client/api/MessageBufferOverflow;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->overflow:Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->channelTypes:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->capacity:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->overflow:Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->channelTypes:Ljava/util/Set;

    iget v1, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->capacity:I

    iget-object v2, p0, Lio/getstream/chat/android/client/api/MessageBufferConfig;->overflow:Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "MessageBufferConfig(channelTypes="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", capacity="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", overflow="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
