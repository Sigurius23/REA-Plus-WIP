.class public final Llive/hms/video/polls/network/HMSPollLeaderboardResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010*\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010+\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010 Jr\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00052\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001aR\u001a\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u001aR\u001a\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u001e\u0010\u001aR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\u0008\u001f\u0010 \u00a8\u00063"
    }
    d2 = {
        "Llive/hms/video/polls/network/HMSPollLeaderboardResponse;",
        "",
        "pollId",
        "",
        "last",
        "",
        "leaderboard",
        "",
        "Llive/hms/video/polls/network/LeaderboardQuestion;",
        "totalUsers",
        "",
        "votedUsers",
        "correctUsers",
        "avgTime",
        "avgScore",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)V",
        "getPollId",
        "()Ljava/lang/String;",
        "getLast",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getLeaderboard",
        "()Ljava/util/List;",
        "getTotalUsers",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getVotedUsers",
        "getCorrectUsers",
        "getAvgTime",
        "getAvgScore",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "mapToPollLeaderboardResponse",
        "Llive/hms/video/polls/network/PollLeaderboardResponse;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)Llive/hms/video/polls/network/HMSPollLeaderboardResponse;",
        "equals",
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
.field private final avgScore:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_score"
    .end annotation
.end field

.field private final avgTime:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_time"
    .end annotation
.end field

.field private final correctUsers:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "correct_users"
    .end annotation
.end field

.field private final last:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last"
    .end annotation
.end field

.field private final leaderboard:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "questions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/network/LeaderboardQuestion;",
            ">;"
        }
    .end annotation
.end field

.field private final pollId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll_id"
    .end annotation
.end field

.field private final totalUsers:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_users"
    .end annotation
.end field

.field private final votedUsers:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "voted_users"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/network/LeaderboardQuestion;",
            ">;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Float;",
            ")V"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->pollId:Ljava/lang/String;

    iput-object p2, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->last:Ljava/lang/Boolean;

    iput-object p3, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->leaderboard:Ljava/util/List;

    iput-object p4, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->totalUsers:Ljava/lang/Long;

    iput-object p5, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->votedUsers:Ljava/lang/Long;

    iput-object p6, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->correctUsers:Ljava/lang/Long;

    iput-object p7, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgTime:Ljava/lang/Long;

    iput-object p8, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgScore:Ljava/lang/Float;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/network/HMSPollLeaderboardResponse;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;ILjava/lang/Object;)Llive/hms/video/polls/network/HMSPollLeaderboardResponse;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->pollId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->last:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->leaderboard:Ljava/util/List;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->totalUsers:Ljava/lang/Long;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->votedUsers:Ljava/lang/Long;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->correctUsers:Ljava/lang/Long;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgTime:Ljava/lang/Long;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgScore:Ljava/lang/Float;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->copy(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)Llive/hms/video/polls/network/HMSPollLeaderboardResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->last:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/network/LeaderboardQuestion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->leaderboard:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->totalUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->votedUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public final component6()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->correctUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public final component7()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgTime:Ljava/lang/Long;

    return-object v0
.end method

.method public final component8()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgScore:Ljava/lang/Float;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)Llive/hms/video/polls/network/HMSPollLeaderboardResponse;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/network/LeaderboardQuestion;",
            ">;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Float;",
            ")",
            "Llive/hms/video/polls/network/HMSPollLeaderboardResponse;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->pollId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->pollId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->last:Ljava/lang/Boolean;

    iget-object v3, p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->last:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->leaderboard:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->leaderboard:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->totalUsers:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->totalUsers:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->votedUsers:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->votedUsers:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->correctUsers:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->correctUsers:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgTime:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgTime:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgScore:Ljava/lang/Float;

    iget-object p1, p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgScore:Ljava/lang/Float;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAvgScore()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgScore:Ljava/lang/Float;

    return-object v0
.end method

.method public final getAvgTime()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgTime:Ljava/lang/Long;

    return-object v0
.end method

.method public final getCorrectUsers()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->correctUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public final getLast()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->last:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getLeaderboard()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/network/LeaderboardQuestion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->leaderboard:Ljava/util/List;

    return-object v0
.end method

.method public final getPollId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalUsers()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->totalUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public final getVotedUsers()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->votedUsers:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->pollId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->last:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->leaderboard:Ljava/util/List;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->totalUsers:Ljava/lang/Long;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->votedUsers:Ljava/lang/Long;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->correctUsers:Ljava/lang/Long;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgTime:Ljava/lang/Long;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgScore:Ljava/lang/Float;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    return v0
.end method

.method public final mapToPollLeaderboardResponse()Llive/hms/video/polls/network/PollLeaderboardResponse;
    .locals 11

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->leaderboard:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/polls/network/LeaderboardQuestion;

    new-instance v4, Llive/hms/video/polls/network/HMSPollLeaderboardEntry;

    invoke-virtual {v3}, Llive/hms/video/polls/network/LeaderboardQuestion;->getPosition()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3}, Llive/hms/video/polls/network/LeaderboardQuestion;->getScore()Ljava/lang/Float;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    float-to-long v6, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_1

    :cond_0
    move-object v6, v1

    :goto_1
    invoke-virtual {v3}, Llive/hms/video/polls/network/LeaderboardQuestion;->getTotalResponse()Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v3}, Llive/hms/video/polls/network/LeaderboardQuestion;->getCorrectResponses()Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v3}, Llive/hms/video/polls/network/LeaderboardQuestion;->getDuration()Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v3}, Llive/hms/video/polls/network/LeaderboardQuestion;->getPollPeer()Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    move-result-object v10

    invoke-direct/range {v4 .. v10}, Llive/hms/video/polls/network/HMSPollLeaderboardEntry;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)V

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v2, v1

    :cond_2
    new-instance v3, Llive/hms/video/polls/network/HMSPollLeaderboardSummary;

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->totalUsers:Ljava/lang/Long;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v4, v0

    goto :goto_2

    :cond_3
    move-object v4, v1

    :goto_2
    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->votedUsers:Ljava/lang/Long;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    long-to-int v0, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v5, v0

    goto :goto_3

    :cond_4
    move-object v5, v1

    :goto_3
    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->correctUsers:Ljava/lang/Long;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_5
    move-object v6, v1

    iget-object v7, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgTime:Ljava/lang/Long;

    iget-object v8, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgScore:Ljava/lang/Float;

    invoke-direct/range {v3 .. v8}, Llive/hms/video/polls/network/HMSPollLeaderboardSummary;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;)V

    iget-object v0, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->last:Ljava/lang/Boolean;

    new-instance v1, Llive/hms/video/polls/network/PollLeaderboardResponse;

    invoke-direct {v1, v2, v3, v0}, Llive/hms/video/polls/network/PollLeaderboardResponse;-><init>(Ljava/util/List;Llive/hms/video/polls/network/HMSPollLeaderboardSummary;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSPollLeaderboardResponse(pollId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->pollId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", last="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->last:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", leaderboard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->leaderboard:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalUsers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->totalUsers:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", votedUsers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->votedUsers:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", correctUsers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->correctUsers:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", avgTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", avgScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->avgScore:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
