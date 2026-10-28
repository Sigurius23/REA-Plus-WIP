.class public final Llive/hms/video/sdk/models/HMSNotifications$Plugins;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Plugins"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J3\u0010\u0014\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$Plugins;",
        "",
        "whiteboard",
        "Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;",
        "transcriptions",
        "",
        "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPlugin;",
        "noiseCancellation",
        "Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;",
        "<init>",
        "(Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;Ljava/util/List;Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;)V",
        "getWhiteboard",
        "()Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;",
        "getTranscriptions",
        "()Ljava/util/List;",
        "getNoiseCancellation",
        "()Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;",
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
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final noiseCancellation:Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "noiseCancellation"
    .end annotation
.end field

.field private final transcriptions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "transcriptions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPlugin;",
            ">;"
        }
    .end annotation
.end field

.field private final whiteboard:Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "whiteboard"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;Ljava/util/List;Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPlugin;",
            ">;",
            "Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->whiteboard:Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->transcriptions:Ljava/util/List;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->noiseCancellation:Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$Plugins;Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;Ljava/util/List;Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$Plugins;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->whiteboard:Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->transcriptions:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->noiseCancellation:Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->copy(Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;Ljava/util/List;Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;)Llive/hms/video/sdk/models/HMSNotifications$Plugins;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->whiteboard:Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPlugin;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->transcriptions:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->noiseCancellation:Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;

    return-object v0
.end method

.method public final copy(Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;Ljava/util/List;Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;)Llive/hms/video/sdk/models/HMSNotifications$Plugins;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPlugin;",
            ">;",
            "Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;",
            ")",
            "Llive/hms/video/sdk/models/HMSNotifications$Plugins;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/sdk/models/HMSNotifications$Plugins;-><init>(Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;Ljava/util/List;Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$Plugins;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$Plugins;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->whiteboard:Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->whiteboard:Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->transcriptions:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->transcriptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->noiseCancellation:Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->noiseCancellation:Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getNoiseCancellation()Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->noiseCancellation:Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;

    return-object v0
.end method

.method public final getTranscriptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPlugin;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->transcriptions:Ljava/util/List;

    return-object v0
.end method

.method public final getWhiteboard()Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->whiteboard:Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->whiteboard:Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->transcriptions:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->noiseCancellation:Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Plugins(whiteboard="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->whiteboard:Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcriptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->transcriptions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noiseCancellation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$Plugins;->noiseCancellation:Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
