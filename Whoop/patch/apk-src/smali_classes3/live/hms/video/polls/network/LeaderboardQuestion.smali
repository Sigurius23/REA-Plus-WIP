.class public final Llive/hms/video/polls/network/LeaderboardQuestion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BM\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003Jb\u0010!\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0012\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u000fR\u001a\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006*"
    }
    d2 = {
        "Llive/hms/video/polls/network/LeaderboardQuestion;",
        "",
        "questionIndex",
        "",
        "position",
        "duration",
        "totalResponse",
        "correctResponses",
        "score",
        "",
        "pollPeer",
        "Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;",
        "<init>",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)V",
        "getQuestionIndex",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getPosition",
        "getDuration",
        "getTotalResponse",
        "getCorrectResponses",
        "getScore",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getPollPeer",
        "()Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)Llive/hms/video/polls/network/LeaderboardQuestion;",
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
.field private final correctResponses:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "correct_responses"
    .end annotation
.end field

.field private final duration:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "duration"
    .end annotation
.end field

.field private final pollPeer:Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peer"
    .end annotation
.end field

.field private final position:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "position"
    .end annotation
.end field

.field private final questionIndex:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "question"
    .end annotation
.end field

.field private final score:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "score"
    .end annotation
.end field

.field private final totalResponse:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_responses"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->questionIndex:Ljava/lang/Long;

    iput-object p2, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->position:Ljava/lang/Long;

    iput-object p3, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->duration:Ljava/lang/Long;

    iput-object p4, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->totalResponse:Ljava/lang/Long;

    iput-object p5, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->correctResponses:Ljava/lang/Long;

    iput-object p6, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->score:Ljava/lang/Float;

    iput-object p7, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->pollPeer:Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/network/LeaderboardQuestion;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;ILjava/lang/Object;)Llive/hms/video/polls/network/LeaderboardQuestion;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->questionIndex:Ljava/lang/Long;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->position:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->duration:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->totalResponse:Ljava/lang/Long;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->correctResponses:Ljava/lang/Long;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->score:Ljava/lang/Float;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->pollPeer:Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Llive/hms/video/polls/network/LeaderboardQuestion;->copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)Llive/hms/video/polls/network/LeaderboardQuestion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->questionIndex:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->position:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->duration:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->totalResponse:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->correctResponses:Ljava/lang/Long;

    return-object v0
.end method

.method public final component6()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->score:Ljava/lang/Float;

    return-object v0
.end method

.method public final component7()Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->pollPeer:Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)Llive/hms/video/polls/network/LeaderboardQuestion;
    .locals 8

    new-instance v0, Llive/hms/video/polls/network/LeaderboardQuestion;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Llive/hms/video/polls/network/LeaderboardQuestion;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/network/LeaderboardQuestion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/network/LeaderboardQuestion;

    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->questionIndex:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/LeaderboardQuestion;->questionIndex:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->position:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/LeaderboardQuestion;->position:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->duration:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/LeaderboardQuestion;->duration:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->totalResponse:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/LeaderboardQuestion;->totalResponse:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->correctResponses:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/LeaderboardQuestion;->correctResponses:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->score:Ljava/lang/Float;

    iget-object v3, p1, Llive/hms/video/polls/network/LeaderboardQuestion;->score:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->pollPeer:Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    iget-object p1, p1, Llive/hms/video/polls/network/LeaderboardQuestion;->pollPeer:Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCorrectResponses()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->correctResponses:Ljava/lang/Long;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->duration:Ljava/lang/Long;

    return-object v0
.end method

.method public final getPollPeer()Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->pollPeer:Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    return-object v0
.end method

.method public final getPosition()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->position:Ljava/lang/Long;

    return-object v0
.end method

.method public final getQuestionIndex()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->questionIndex:Ljava/lang/Long;

    return-object v0
.end method

.method public final getScore()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->score:Ljava/lang/Float;

    return-object v0
.end method

.method public final getTotalResponse()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->totalResponse:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->questionIndex:Ljava/lang/Long;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->position:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->duration:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->totalResponse:Ljava/lang/Long;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->correctResponses:Ljava/lang/Long;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->score:Ljava/lang/Float;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->pollPeer:Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LeaderboardQuestion(questionIndex="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->questionIndex:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->position:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->duration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->totalResponse:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", correctResponses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->correctResponses:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->score:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pollPeer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/LeaderboardQuestion;->pollPeer:Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
