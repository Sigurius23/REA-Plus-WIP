.class public final Llive/hms/video/polls/network/PollResultsDisplay;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000cJ\u000f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003JB\u0010\u0016\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000cR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000e\u0010\u000cR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000f\u0010\u000cR\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/polls/network/PollResultsDisplay;",
        "",
        "totalResponses",
        "",
        "votingUsers",
        "totalDistinctUsers",
        "questions",
        "",
        "Llive/hms/video/polls/models/PollStatsQuestions;",
        "<init>",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V",
        "getTotalResponses",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getVotingUsers",
        "getTotalDistinctUsers",
        "getQuestions",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Llive/hms/video/polls/network/PollResultsDisplay;",
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
.field private final questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;"
        }
    .end annotation
.end field

.field private final totalDistinctUsers:Ljava/lang/Long;

.field private final totalResponses:Ljava/lang/Long;

.field private final votingUsers:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;)V"
        }
    .end annotation

    const-string v0, "questions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalResponses:Ljava/lang/Long;

    .line 3
    iput-object p2, p0, Llive/hms/video/polls/network/PollResultsDisplay;->votingUsers:Ljava/lang/Long;

    .line 4
    iput-object p3, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalDistinctUsers:Ljava/lang/Long;

    .line 5
    iput-object p4, p0, Llive/hms/video/polls/network/PollResultsDisplay;->questions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/polls/network/PollResultsDisplay;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/network/PollResultsDisplay;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;ILjava/lang/Object;)Llive/hms/video/polls/network/PollResultsDisplay;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalResponses:Ljava/lang/Long;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/polls/network/PollResultsDisplay;->votingUsers:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalDistinctUsers:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Llive/hms/video/polls/network/PollResultsDisplay;->questions:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/polls/network/PollResultsDisplay;->copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Llive/hms/video/polls/network/PollResultsDisplay;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalResponses:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsDisplay;->votingUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalDistinctUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsDisplay;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Llive/hms/video/polls/network/PollResultsDisplay;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;)",
            "Llive/hms/video/polls/network/PollResultsDisplay;"
        }
    .end annotation

    const-string v0, "questions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/polls/network/PollResultsDisplay;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/polls/network/PollResultsDisplay;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/network/PollResultsDisplay;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/network/PollResultsDisplay;

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalResponses:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/PollResultsDisplay;->totalResponses:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->votingUsers:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/PollResultsDisplay;->votingUsers:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalDistinctUsers:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/PollResultsDisplay;->totalDistinctUsers:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->questions:Ljava/util/List;

    iget-object p1, p1, Llive/hms/video/polls/network/PollResultsDisplay;->questions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/PollStatsQuestions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsDisplay;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalDistinctUsers()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalDistinctUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public final getTotalResponses()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalResponses:Ljava/lang/Long;

    return-object v0
.end method

.method public final getVotingUsers()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsDisplay;->votingUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalResponses:Ljava/lang/Long;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/polls/network/PollResultsDisplay;->votingUsers:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalDistinctUsers:Ljava/lang/Long;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->questions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PollResultsDisplay(totalResponses="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalResponses:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", votingUsers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->votingUsers:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalDistinctUsers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->totalDistinctUsers:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", questions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsDisplay;->questions:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
