.class public final Llive/hms/video/polls/models/question/HmsPollQuestionCreation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0011\u0008\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0015J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\tH\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\u000cH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010/\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\t\u00100\u001a\u00020\tH\u00c6\u0003Jv\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\t2\u0008\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\t\u00106\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0017R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\u0008\"\u0010#R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\u0008%\u0010#R\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001d\u00a8\u00067"
    }
    d2 = {
        "Llive/hms/video/polls/models/question/HmsPollQuestionCreation;",
        "",
        "questionID",
        "",
        "type",
        "Llive/hms/video/polls/models/question/HMSPollQuestionType;",
        "text",
        "",
        "canSkip",
        "",
        "canChangeResponse",
        "duration",
        "",
        "weight",
        "answerShortMinLength",
        "answerLongMinLength",
        "negative",
        "<init>",
        "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Z)V",
        "q",
        "Llive/hms/video/polls/models/question/HMSPollQuestion;",
        "(Llive/hms/video/polls/models/question/HMSPollQuestion;)V",
        "getQuestionID",
        "()I",
        "getType",
        "()Llive/hms/video/polls/models/question/HMSPollQuestionType;",
        "getText",
        "()Ljava/lang/String;",
        "getCanSkip",
        "()Z",
        "getCanChangeResponse",
        "getDuration",
        "()J",
        "getWeight",
        "getAnswerShortMinLength",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getAnswerLongMinLength",
        "getNegative",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Z)Llive/hms/video/polls/models/question/HmsPollQuestionCreation;",
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
.field private final answerLongMinLength:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "answer_max_len"
    .end annotation
.end field

.field private final answerShortMinLength:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "answer_min_len"
    .end annotation
.end field

.field private final canChangeResponse:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "once"
    .end annotation
.end field

.field private final canSkip:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "skippable"
    .end annotation
.end field

.field private final duration:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "duration"
    .end annotation
.end field

.field private final negative:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "negative"
    .end annotation
.end field

.field private final questionID:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "index"
    .end annotation
.end field

.field private final text:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "text"
    .end annotation
.end field

.field private final type:Llive/hms/video/polls/models/question/HMSPollQuestionType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field

.field private final weight:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weight"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Z)V
    .locals 1

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->questionID:I

    .line 3
    iput-object p2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    .line 4
    iput-object p3, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->text:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canSkip:Z

    .line 6
    iput-boolean p5, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canChangeResponse:Z

    .line 7
    iput-wide p6, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->duration:J

    .line 8
    iput p8, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->weight:I

    .line 9
    iput-object p9, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerShortMinLength:Ljava/lang/Long;

    .line 10
    iput-object p10, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerLongMinLength:Ljava/lang/Long;

    .line 11
    iput-boolean p11, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->negative:Z

    return-void
.end method

.method public synthetic constructor <init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p12

    const-wide/16 v1, 0x1

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    and-int/lit8 v2, v0, 0x8

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move v8, v3

    goto :goto_0

    :cond_0
    move/from16 v8, p4

    :goto_0
    and-int/lit8 v2, v0, 0x10

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    move v9, v4

    goto :goto_1

    :cond_1
    move/from16 v9, p5

    :goto_1
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_2

    const-wide/16 v5, 0x0

    move-wide v10, v5

    goto :goto_2

    :cond_2
    move-wide/from16 v10, p6

    :goto_2
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_3

    move v12, v4

    goto :goto_3

    :cond_3
    move/from16 v12, p8

    :goto_3
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_4

    move-object v13, v1

    goto :goto_4

    :cond_4
    move-object/from16 v13, p9

    :goto_4
    and-int/lit16 v2, v0, 0x100

    if-eqz v2, :cond_5

    move-object v14, v1

    goto :goto_5

    :cond_5
    move-object/from16 v14, p10

    :goto_5
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_6

    move v15, v3

    :goto_6
    move-object/from16 v4, p0

    move/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    goto :goto_7

    :cond_6
    move/from16 v15, p11

    goto :goto_6

    .line 13
    :goto_7
    invoke-direct/range {v4 .. v15}, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Z)V

    return-void
.end method

.method public constructor <init>(Llive/hms/video/polls/models/question/HMSPollQuestion;)V
    .locals 15

    const-string v0, "q"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getQuestionID()I

    move-result v2

    .line 15
    invoke-virtual {v1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getType()Llive/hms/video/polls/models/question/HMSPollQuestionType;

    move-result-object v3

    .line 16
    invoke-virtual {v1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getText()Ljava/lang/String;

    move-result-object v4

    .line 17
    invoke-virtual {v1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getCanSkip()Z

    move-result v5

    .line 18
    invoke-virtual {v1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getCanChangeResponse()Z

    move-result v6

    .line 19
    invoke-virtual {v1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getDuration()J

    move-result-wide v7

    .line 20
    invoke-virtual {v1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getWeight()I

    move-result v9

    .line 21
    invoke-virtual {v1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getAnswerShortMinLength()Ljava/lang/Long;

    move-result-object v10

    const/16 v13, 0x300

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v1, p0

    .line 22
    invoke-direct/range {v1 .. v14}, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/models/question/HmsPollQuestionCreation;ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;ZILjava/lang/Object;)Llive/hms/video/polls/models/question/HmsPollQuestionCreation;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->questionID:I

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->text:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-boolean p4, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canSkip:Z

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-boolean p5, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canChangeResponse:Z

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-wide p6, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->duration:J

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p8, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->weight:I

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p9, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerShortMinLength:Ljava/lang/Long;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p10, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerLongMinLength:Ljava/lang/Long;

    :cond_8
    and-int/lit16 p12, p12, 0x200

    if-eqz p12, :cond_9

    iget-boolean p11, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->negative:Z

    :cond_9
    move-object p12, p10

    move p13, p11

    move p10, p8

    move-object p11, p9

    move-wide p8, p6

    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->copy(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Z)Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->questionID:I

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->negative:Z

    return v0
.end method

.method public final component2()Llive/hms/video/polls/models/question/HMSPollQuestionType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canSkip:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canChangeResponse:Z

    return v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->duration:J

    return-wide v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->weight:I

    return v0
.end method

.method public final component8()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerShortMinLength:Ljava/lang/Long;

    return-object v0
.end method

.method public final component9()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerLongMinLength:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Z)Llive/hms/video/polls/models/question/HmsPollQuestionCreation;
    .locals 13

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    move v2, p1

    move-object v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    iget v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->questionID:I

    iget v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->questionID:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->text:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canSkip:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canSkip:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canChangeResponse:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canChangeResponse:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->duration:J

    iget-wide v5, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->duration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->weight:I

    iget v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->weight:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerShortMinLength:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerShortMinLength:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerLongMinLength:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerLongMinLength:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->negative:Z

    iget-boolean p1, p1, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->negative:Z

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAnswerLongMinLength()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerLongMinLength:Ljava/lang/Long;

    return-object v0
.end method

.method public final getAnswerShortMinLength()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerShortMinLength:Ljava/lang/Long;

    return-object v0
.end method

.method public final getCanChangeResponse()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canChangeResponse:Z

    return v0
.end method

.method public final getCanSkip()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canSkip:Z

    return v0
.end method

.method public final getDuration()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->duration:J

    return-wide v0
.end method

.method public final getNegative()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->negative:Z

    return v0
.end method

.method public final getQuestionID()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->questionID:I

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Llive/hms/video/polls/models/question/HMSPollQuestionType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    return-object v0
.end method

.method public final getWeight()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->weight:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->questionID:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->text:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canSkip:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canChangeResponse:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->duration:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->weight:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerShortMinLength:Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerLongMinLength:Ljava/lang/Long;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->negative:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HmsPollQuestionCreation(questionID="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->questionID:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", canSkip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canSkip:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", canChangeResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->canChangeResponse:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->duration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->weight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", answerShortMinLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerShortMinLength:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", answerLongMinLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->answerLongMinLength:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", negative="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->negative:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
