.class public final Llive/hms/video/polls/network/PollResultsItems;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003JG\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR\u0016\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006$"
    }
    d2 = {
        "Llive/hms/video/polls/network/PollResultsItems;",
        "",
        "questionIndex",
        "",
        "correct",
        "type",
        "Llive/hms/video/polls/models/question/HMSPollQuestionType;",
        "skipped",
        "total",
        "error",
        "Llive/hms/video/error/HMSException;",
        "<init>",
        "(JJLlive/hms/video/polls/models/question/HMSPollQuestionType;JJLlive/hms/video/error/HMSException;)V",
        "getQuestionIndex",
        "()J",
        "getCorrect",
        "getType",
        "()Llive/hms/video/polls/models/question/HMSPollQuestionType;",
        "getSkipped",
        "getTotal",
        "getError",
        "()Llive/hms/video/error/HMSException;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
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
.field private final correct:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "correct"
    .end annotation
.end field

.field private final error:Llive/hms/video/error/HMSException;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "error"
    .end annotation
.end field

.field private final questionIndex:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "question"
    .end annotation
.end field

.field private final skipped:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "skipped"
    .end annotation
.end field

.field private final total:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total"
    .end annotation
.end field

.field private final type:Llive/hms/video/polls/models/question/HMSPollQuestionType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JJLlive/hms/video/polls/models/question/HMSPollQuestionType;JJLlive/hms/video/error/HMSException;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/polls/network/PollResultsItems;->questionIndex:J

    iput-wide p3, p0, Llive/hms/video/polls/network/PollResultsItems;->correct:J

    iput-object p5, p0, Llive/hms/video/polls/network/PollResultsItems;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    iput-wide p6, p0, Llive/hms/video/polls/network/PollResultsItems;->skipped:J

    iput-wide p8, p0, Llive/hms/video/polls/network/PollResultsItems;->total:J

    iput-object p10, p0, Llive/hms/video/polls/network/PollResultsItems;->error:Llive/hms/video/error/HMSException;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/network/PollResultsItems;JJLlive/hms/video/polls/models/question/HMSPollQuestionType;JJLlive/hms/video/error/HMSException;ILjava/lang/Object;)Llive/hms/video/polls/network/PollResultsItems;
    .locals 11

    and-int/lit8 v0, p11, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Llive/hms/video/polls/network/PollResultsItems;->questionIndex:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p11, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Llive/hms/video/polls/network/PollResultsItems;->correct:J

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p11, 0x4

    if-eqz p1, :cond_2

    iget-object p1, p0, Llive/hms/video/polls/network/PollResultsItems;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    move-object v5, p1

    goto :goto_0

    :cond_2
    move-object/from16 v5, p5

    :goto_0
    and-int/lit8 p1, p11, 0x8

    if-eqz p1, :cond_3

    iget-wide p1, p0, Llive/hms/video/polls/network/PollResultsItems;->skipped:J

    move-wide v6, p1

    goto :goto_1

    :cond_3
    move-wide/from16 v6, p6

    :goto_1
    and-int/lit8 p1, p11, 0x10

    if-eqz p1, :cond_4

    iget-wide p1, p0, Llive/hms/video/polls/network/PollResultsItems;->total:J

    move-wide v8, p1

    goto :goto_2

    :cond_4
    move-wide/from16 v8, p8

    :goto_2
    and-int/lit8 p1, p11, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Llive/hms/video/polls/network/PollResultsItems;->error:Llive/hms/video/error/HMSException;

    move-object v10, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_5
    move-object/from16 v10, p10

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v10}, Llive/hms/video/polls/network/PollResultsItems;->copy(JJLlive/hms/video/polls/models/question/HMSPollQuestionType;JJLlive/hms/video/error/HMSException;)Llive/hms/video/polls/network/PollResultsItems;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsItems;->questionIndex:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsItems;->correct:J

    return-wide v0
.end method

.method public final component3()Llive/hms/video/polls/models/question/HMSPollQuestionType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsItems;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsItems;->skipped:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsItems;->total:J

    return-wide v0
.end method

.method public final component6()Llive/hms/video/error/HMSException;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsItems;->error:Llive/hms/video/error/HMSException;

    return-object v0
.end method

.method public final copy(JJLlive/hms/video/polls/models/question/HMSPollQuestionType;JJLlive/hms/video/error/HMSException;)Llive/hms/video/polls/network/PollResultsItems;
    .locals 12

    const-string v0, "type"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/polls/network/PollResultsItems;

    move-wide v2, p1

    move-wide v4, p3

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Llive/hms/video/polls/network/PollResultsItems;-><init>(JJLlive/hms/video/polls/models/question/HMSPollQuestionType;JJLlive/hms/video/error/HMSException;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/network/PollResultsItems;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/network/PollResultsItems;

    iget-wide v3, p0, Llive/hms/video/polls/network/PollResultsItems;->questionIndex:J

    iget-wide v5, p1, Llive/hms/video/polls/network/PollResultsItems;->questionIndex:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llive/hms/video/polls/network/PollResultsItems;->correct:J

    iget-wide v5, p1, Llive/hms/video/polls/network/PollResultsItems;->correct:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsItems;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    iget-object v3, p1, Llive/hms/video/polls/network/PollResultsItems;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Llive/hms/video/polls/network/PollResultsItems;->skipped:J

    iget-wide v5, p1, Llive/hms/video/polls/network/PollResultsItems;->skipped:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Llive/hms/video/polls/network/PollResultsItems;->total:J

    iget-wide v5, p1, Llive/hms/video/polls/network/PollResultsItems;->total:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsItems;->error:Llive/hms/video/error/HMSException;

    iget-object p1, p1, Llive/hms/video/polls/network/PollResultsItems;->error:Llive/hms/video/error/HMSException;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCorrect()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsItems;->correct:J

    return-wide v0
.end method

.method public final getError()Llive/hms/video/error/HMSException;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsItems;->error:Llive/hms/video/error/HMSException;

    return-object v0
.end method

.method public final getQuestionIndex()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsItems;->questionIndex:J

    return-wide v0
.end method

.method public final getSkipped()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsItems;->skipped:J

    return-wide v0
.end method

.method public final getTotal()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsItems;->total:J

    return-wide v0
.end method

.method public final getType()Llive/hms/video/polls/models/question/HMSPollQuestionType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/network/PollResultsItems;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Llive/hms/video/polls/network/PollResultsItems;->questionIndex:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Llive/hms/video/polls/network/PollResultsItems;->correct:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/polls/network/PollResultsItems;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Llive/hms/video/polls/network/PollResultsItems;->skipped:J

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/polls/network/PollResultsItems;->total:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsItems;->error:Llive/hms/video/error/HMSException;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PollResultsItems(questionIndex="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/polls/network/PollResultsItems;->questionIndex:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", correct="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/network/PollResultsItems;->correct:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsItems;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", skipped="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/network/PollResultsItems;->skipped:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/network/PollResultsItems;->total:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/network/PollResultsItems;->error:Llive/hms/video/error/HMSException;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
