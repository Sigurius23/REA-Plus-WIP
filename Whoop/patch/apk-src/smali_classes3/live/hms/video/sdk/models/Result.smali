.class public final Llive/hms/video/sdk/models/Result;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000b\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Llive/hms/video/sdk/models/Result;",
        "",
        "mode",
        "Llive/hms/video/sdk/models/TranscriptionsMode;",
        "<init>",
        "(Llive/hms/video/sdk/models/TranscriptionsMode;)V",
        "getMode",
        "()Llive/hms/video/sdk/models/TranscriptionsMode;",
        "component1",
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
.field private final mode:Llive/hms/video/sdk/models/TranscriptionsMode;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "mode"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/TranscriptionsMode;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/Result;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/Result;Llive/hms/video/sdk/models/TranscriptionsMode;ILjava/lang/Object;)Llive/hms/video/sdk/models/Result;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/Result;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/sdk/models/Result;->copy(Llive/hms/video/sdk/models/TranscriptionsMode;)Llive/hms/video/sdk/models/Result;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/sdk/models/TranscriptionsMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/Result;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-object v0
.end method

.method public final copy(Llive/hms/video/sdk/models/TranscriptionsMode;)Llive/hms/video/sdk/models/Result;
    .locals 1

    new-instance v0, Llive/hms/video/sdk/models/Result;

    invoke-direct {v0, p1}, Llive/hms/video/sdk/models/Result;-><init>(Llive/hms/video/sdk/models/TranscriptionsMode;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/Result;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/Result;

    iget-object v1, p0, Llive/hms/video/sdk/models/Result;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    iget-object p1, p1, Llive/hms/video/sdk/models/Result;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMode()Llive/hms/video/sdk/models/TranscriptionsMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/Result;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/Result;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Result(mode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/Result;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
