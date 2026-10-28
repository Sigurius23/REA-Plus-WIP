.class public final Llive/hms/video/polls/network/PollResultsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JA\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u001c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Llive/hms/video/polls/network/PollResultsResponse;",
        "",
        "pollId",
        "",
        "totalResponses",
        "",
        "votingUsers",
        "totalDistinctUsers",
        "question",
        "",
        "Llive/hms/video/polls/models/PollStatsQuestions;",
        "<init>",
        "(Ljava/lang/String;JJJLjava/util/List;)V",
        "getPollId",
        "()Ljava/lang/String;",
        "getTotalResponses",
        "()J",
        "getVotingUsers",
        "getTotalDistinctUsers",
        "getQuestion",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final pollId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll_id"
    .end annotation
.end field

.field private final question:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "questions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;"
        }
    .end annotation
.end field

.field private final totalDistinctUsers:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_user"
    .end annotation
.end field

.field private final totalResponses:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_response"
    .end annotation
.end field

.field private final votingUsers:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_count"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;JJJLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJJ",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "question"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/polls/network/PollResultsResponse;->pollId:Ljava/lang/String;

    iput-wide p2, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalResponses:J

    iput-wide p4, p0, Llive/hms/video/polls/network/PollResultsResponse;->votingUsers:J

    iput-wide p6, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalDistinctUsers:J

    iput-object p8, p0, Llive/hms/video/polls/network/PollResultsResponse;->question:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/network/PollResultsResponse;Ljava/lang/String;JJJLjava/util/List;ILjava/lang/Object;)Llive/hms/video/polls/network/PollResultsResponse;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Llive/hms/video/polls/network/PollResultsResponse;->pollId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-wide p2, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalResponses:J

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-wide p4, p0, Llive/hms/video/polls/network/PollResultsResponse;->votingUsers:J

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-wide p6, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalDistinctUsers:J

    :cond_3
    and-int/lit8 p9, p9, 0x10

    if-eqz p9, :cond_4

    iget-object p8, p0, Llive/hms/video/polls/network/PollResultsResponse;->question:Ljava/util/List;

    :cond_4
    move-object p10, p8

    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p10}, Llive/hms/video/polls/network/PollResultsResponse;->copy(Ljava/lang/String;JJJLjava/util/List;)Llive/hms/video/polls/network/PollResultsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalResponses:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->votingUsers:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalDistinctUsers:J

    return-wide v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->question:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JJJLjava/util/List;)Llive/hms/video/polls/network/PollResultsResponse;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJJ",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;)",
            "Llive/hms/video/polls/network/PollResultsResponse;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "question"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/polls/network/PollResultsResponse;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move-wide/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Llive/hms/video/polls/network/PollResultsResponse;-><init>(Ljava/lang/String;JJJLjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/network/PollResultsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/network/PollResultsResponse;

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsResponse;->pollId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/network/PollResultsResponse;->pollId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalResponses:J

    iget-wide v5, p1, Llive/hms/video/polls/network/PollResultsResponse;->totalResponses:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/polls/network/PollResultsResponse;->votingUsers:J

    iget-wide v5, p1, Llive/hms/video/polls/network/PollResultsResponse;->votingUsers:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalDistinctUsers:J

    iget-wide v5, p1, Llive/hms/video/polls/network/PollResultsResponse;->totalDistinctUsers:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsResponse;->question:Ljava/util/List;

    iget-object p1, p1, Llive/hms/video/polls/network/PollResultsResponse;->question:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getPollId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuestion()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->question:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalDistinctUsers()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalDistinctUsers:J

    return-wide v0
.end method

.method public final getTotalResponses()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalResponses:J

    return-wide v0
.end method

.method public final getVotingUsers()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->votingUsers:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsResponse;->pollId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalResponses:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/polls/network/PollResultsResponse;->votingUsers:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalDistinctUsers:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsResponse;->question:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PollResultsResponse(pollId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsResponse;->pollId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", totalResponses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalResponses:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", votingUsers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/network/PollResultsResponse;->votingUsers:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalDistinctUsers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/network/PollResultsResponse;->totalDistinctUsers:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", question="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsResponse;->question:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
