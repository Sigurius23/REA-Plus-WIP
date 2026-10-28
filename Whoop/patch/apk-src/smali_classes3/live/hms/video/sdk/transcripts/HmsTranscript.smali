.class public final Llive/hms/video/sdk/transcripts/HmsTranscript;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J;\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010#\u001a\u00020\t2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\'"
    }
    d2 = {
        "Llive/hms/video/sdk/transcripts/HmsTranscript;",
        "",
        "start",
        "",
        "end",
        "transcript",
        "",
        "peerId",
        "isFinal",
        "",
        "<init>",
        "(IILjava/lang/String;Ljava/lang/String;Z)V",
        "getStart",
        "()I",
        "getEnd",
        "getTranscript",
        "()Ljava/lang/String;",
        "getPeerId",
        "()Z",
        "store",
        "Llive/hms/video/sdk/SDKStore;",
        "getStore$lib_release",
        "()Llive/hms/video/sdk/SDKStore;",
        "setStore$lib_release",
        "(Llive/hms/video/sdk/SDKStore;)V",
        "peer",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "getPeer",
        "()Llive/hms/video/sdk/models/HMSPeer;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
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
.field private final end:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "end"
    .end annotation
.end field

.field private final isFinal:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "final"
    .end annotation
.end field

.field private final peerId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peer_id"
    .end annotation
.end field

.field private final start:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start"
    .end annotation
.end field

.field public store:Llive/hms/video/sdk/SDKStore;

.field private final transcript:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "transcript"
    .end annotation
.end field


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "transcript"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->start:I

    iput p2, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->end:I

    iput-object p3, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->transcript:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->peerId:Ljava/lang/String;

    iput-boolean p5, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->isFinal:Z

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/transcripts/HmsTranscript;IILjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Llive/hms/video/sdk/transcripts/HmsTranscript;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->start:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->end:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->transcript:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->peerId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->isFinal:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/sdk/transcripts/HmsTranscript;->copy(IILjava/lang/String;Ljava/lang/String;Z)Llive/hms/video/sdk/transcripts/HmsTranscript;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->start:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->end:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->transcript:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->peerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->isFinal:Z

    return v0
.end method

.method public final copy(IILjava/lang/String;Ljava/lang/String;Z)Llive/hms/video/sdk/transcripts/HmsTranscript;
    .locals 7

    const-string v0, "transcript"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/transcripts/HmsTranscript;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/sdk/transcripts/HmsTranscript;-><init>(IILjava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/transcripts/HmsTranscript;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/transcripts/HmsTranscript;

    iget v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->start:I

    iget v3, p1, Llive/hms/video/sdk/transcripts/HmsTranscript;->start:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->end:I

    iget v3, p1, Llive/hms/video/sdk/transcripts/HmsTranscript;->end:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->transcript:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/transcripts/HmsTranscript;->transcript:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->peerId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/transcripts/HmsTranscript;->peerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->isFinal:Z

    iget-boolean p1, p1, Llive/hms/video/sdk/transcripts/HmsTranscript;->isFinal:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEnd()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->end:I

    return v0
.end method

.method public final getPeer()Llive/hms/video/sdk/models/HMSPeer;
    .locals 2

    invoke-virtual {p0}, Llive/hms/video/sdk/transcripts/HmsTranscript;->getStore$lib_release()Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->peerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v0

    return-object v0
.end method

.method public final getPeerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->peerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getStart()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->start:I

    return v0
.end method

.method public final getStore$lib_release()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->store:Llive/hms/video/sdk/SDKStore;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "store"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getTranscript()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->transcript:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->start:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->end:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->transcript:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->peerId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->isFinal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isFinal()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->isFinal:Z

    return v0
.end method

.method public final setStore$lib_release(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HmsTranscript(start="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->start:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->end:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", transcript="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->transcript:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", peerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->peerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isFinal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/transcripts/HmsTranscript;->isFinal:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
