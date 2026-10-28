.class public final Llive/hms/video/polls/models/question/HMSPollQuestionOption;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u001d\u0008\u0086\u0008\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0008H\u00c6\u0003J\t\u0010 \u001a\u00020\u0008H\u00c6\u0003J\t\u0010!\u001a\u00020\u000bH\u00c6\u0003JN\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00082\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006("
    }
    d2 = {
        "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
        "",
        "index",
        "",
        "text",
        "",
        "weight",
        "case",
        "",
        "trim",
        "voteCount",
        "",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/Integer;ZZJ)V",
        "getIndex",
        "()I",
        "getText",
        "()Ljava/lang/String;",
        "getWeight",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getCase",
        "()Z",
        "getTrim",
        "getVoteCount",
        "()J",
        "setVoteCount",
        "(J)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(ILjava/lang/String;Ljava/lang/Integer;ZZJ)Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
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
.field private final case:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "case"
    .end annotation
.end field

.field private final index:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "index"
    .end annotation
.end field

.field private final text:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "text"
    .end annotation
.end field

.field private final trim:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trim"
    .end annotation
.end field

.field private voteCount:J

.field private final weight:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weight"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/Integer;ZZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->index:I

    .line 3
    iput-object p2, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->text:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->weight:Ljava/lang/Integer;

    .line 5
    iput-boolean p4, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->case:Z

    .line 6
    iput-boolean p5, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->trim:Z

    .line 7
    iput-wide p6, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->voteCount:J

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Integer;ZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    .line 8
    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    move-object v1, p3

    :goto_1
    and-int/lit8 v2, p8, 0x8

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    move v2, p4

    :goto_2
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    move v3, p5

    :goto_3
    and-int/lit8 v4, p8, 0x20

    if-eqz v4, :cond_4

    const-wide/16 v4, 0x0

    move-wide p8, v4

    :goto_4
    move-object p2, p0

    move p3, p1

    move-object p4, v0

    move-object p5, v1

    move p6, v2

    move p7, v3

    goto :goto_5

    :cond_4
    move-wide p8, p6

    goto :goto_4

    .line 9
    :goto_5
    invoke-direct/range {p2 .. p9}, Llive/hms/video/polls/models/question/HMSPollQuestionOption;-><init>(ILjava/lang/String;Ljava/lang/Integer;ZZJ)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/models/question/HMSPollQuestionOption;ILjava/lang/String;Ljava/lang/Integer;ZZJILjava/lang/Object;)Llive/hms/video/polls/models/question/HMSPollQuestionOption;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->index:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->text:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->weight:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->case:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-boolean p5, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->trim:Z

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-wide p6, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->voteCount:J

    :cond_5
    move-wide p8, p6

    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->copy(ILjava/lang/String;Ljava/lang/Integer;ZZJ)Llive/hms/video/polls/models/question/HMSPollQuestionOption;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->index:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->weight:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->case:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->trim:Z

    return v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->voteCount:J

    return-wide v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/Integer;ZZJ)Llive/hms/video/polls/models/question/HMSPollQuestionOption;
    .locals 8

    new-instance v0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-wide v6, p6

    invoke-direct/range {v0 .. v7}, Llive/hms/video/polls/models/question/HMSPollQuestionOption;-><init>(ILjava/lang/String;Ljava/lang/Integer;ZZJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/models/question/HMSPollQuestionOption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/models/question/HMSPollQuestionOption;

    iget v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->index:I

    iget v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->index:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->text:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->weight:Ljava/lang/Integer;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->weight:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->case:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->case:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->trim:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->trim:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->voteCount:J

    iget-wide v5, p1, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->voteCount:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCase()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->case:Z

    return v0
.end method

.method public final getIndex()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->index:I

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrim()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->trim:Z

    return v0
.end method

.method public final getVoteCount()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->voteCount:J

    return-wide v0
.end method

.method public final getWeight()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->weight:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->text:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->weight:Ljava/lang/Integer;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->case:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->trim:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-wide v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->voteCount:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setVoteCount(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->voteCount:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSPollQuestionOption(index="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->weight:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", case="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->case:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", trim="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->trim:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", voteCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->voteCount:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
