.class public final Llive/hms/video/polls/models/question/HMSPollQuestion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u00083\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000c\u0012\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\tH\u00c6\u0003J\t\u0010<\u001a\u00020\tH\u00c6\u0003J\t\u0010=\u001a\u00020\u000cH\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0010\u0010@\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\t\u0010C\u001a\u00020\tH\u00c6\u0003J\u000f\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0003J\u00a4\u0001\u0010E\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\t2\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0001\u00a2\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020\t2\u0008\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001J\t\u0010J\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\"R\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\u0008\'\u0010(R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\u0008*\u0010(R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0016\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\"R\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010,R$\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00083\u0010\u001c\"\u0004\u00084\u00105R\u0011\u00106\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u00087\u0010\"\u00a8\u0006K"
    }
    d2 = {
        "Llive/hms/video/polls/models/question/HMSPollQuestion;",
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
        "options",
        "",
        "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
        "correctAnswer",
        "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;",
        "negative",
        "myResponses",
        "",
        "Llive/hms/video/polls/models/answer/HmsPollAnswer;",
        "<init>",
        "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;)V",
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
        "getOptions",
        "()Ljava/util/List;",
        "getCorrectAnswer",
        "()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;",
        "getNegative",
        "getMyResponses",
        "value",
        "total",
        "getTotal",
        "setTotal$lib_release",
        "(I)V",
        "voted",
        "getVoted",
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
        "component11",
        "component12",
        "component13",
        "copy",
        "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;)Llive/hms/video/polls/models/question/HMSPollQuestion;",
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

.field private final correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "answer"
    .end annotation
.end field

.field private final duration:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "duration"
    .end annotation
.end field

.field private final myResponses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/answer/HmsPollAnswer;",
            ">;"
        }
    .end annotation
.end field

.field private final negative:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "negative"
    .end annotation
.end field

.field private final options:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "options"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
            ">;"
        }
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

.field private total:I

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
.method public constructor <init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Llive/hms/video/polls/models/question/HMSPollQuestionType;",
            "Ljava/lang/String;",
            "ZZJI",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
            ">;",
            "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;",
            "Z",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/answer/HmsPollAnswer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myResponses"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->questionID:I

    .line 3
    iput-object p2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    .line 4
    iput-object p3, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->text:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canSkip:Z

    .line 6
    iput-boolean p5, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canChangeResponse:Z

    .line 7
    iput-wide p6, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->duration:J

    .line 8
    iput p8, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->weight:I

    .line 9
    iput-object p9, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerShortMinLength:Ljava/lang/Long;

    .line 10
    iput-object p10, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerLongMinLength:Ljava/lang/Long;

    .line 11
    iput-object p11, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->options:Ljava/util/List;

    .line 12
    iput-object p12, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    .line 13
    iput-boolean p13, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->negative:Z

    .line 14
    iput-object p14, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->myResponses:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v7, v2

    goto :goto_0

    :cond_0
    move/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v8, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    const-wide/16 v3, 0x0

    move-wide v9, v3

    goto :goto_2

    :cond_2
    move-wide/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move v11, v2

    goto :goto_3

    :cond_3
    move/from16 v11, p8

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    const-wide/16 v3, 0x1

    .line 15
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v12, v1

    goto :goto_4

    :cond_4
    move-object/from16 v12, p9

    :goto_4
    and-int/lit16 v1, v0, 0x100

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    move-object v13, v3

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v14, v3

    goto :goto_6

    :cond_6
    move-object/from16 v14, p11

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v15, v3

    goto :goto_7

    :cond_7
    move-object/from16 v15, p12

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move/from16 v16, v2

    goto :goto_8

    :cond_8
    move/from16 v16, p13

    :goto_8
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_9

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v17, v0

    :goto_9
    move-object/from16 v3, p0

    move/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    goto :goto_a

    :cond_9
    move-object/from16 v17, p14

    goto :goto_9

    .line 17
    :goto_a
    invoke-direct/range {v3 .. v17}, Llive/hms/video/polls/models/question/HMSPollQuestion;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/models/question/HMSPollQuestion;ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;ILjava/lang/Object;)Llive/hms/video/polls/models/question/HMSPollQuestion;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->questionID:I

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->text:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-boolean v4, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canSkip:Z

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-boolean v5, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canChangeResponse:Z

    goto :goto_4

    :cond_4
    move/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-wide v6, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->duration:J

    goto :goto_5

    :cond_5
    move-wide/from16 v6, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    iget v8, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->weight:I

    goto :goto_6

    :cond_6
    move/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    iget-object v9, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerShortMinLength:Ljava/lang/Long;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p9

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    iget-object v10, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerLongMinLength:Ljava/lang/Long;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    iget-object v11, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->options:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    iget-object v12, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p12

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->negative:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p13

    :goto_b
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->myResponses:Ljava/util/List;

    move-object/from16 p15, v0

    :goto_c
    move-object p1, p0

    move/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move/from16 p5, v4

    move/from16 p6, v5

    move-wide/from16 p7, v6

    move/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move/from16 p14, v13

    goto :goto_d

    :cond_c
    move-object/from16 p15, p14

    goto :goto_c

    :goto_d
    invoke-virtual/range {p1 .. p15}, Llive/hms/video/polls/models/question/HMSPollQuestion;->copy(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;)Llive/hms/video/polls/models/question/HMSPollQuestion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->questionID:I

    return v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->options:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->negative:Z

    return v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/answer/HmsPollAnswer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->myResponses:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Llive/hms/video/polls/models/question/HMSPollQuestionType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canSkip:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canChangeResponse:Z

    return v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->duration:J

    return-wide v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->weight:I

    return v0
.end method

.method public final component8()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerShortMinLength:Ljava/lang/Long;

    return-object v0
.end method

.method public final component9()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerLongMinLength:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;)Llive/hms/video/polls/models/question/HMSPollQuestion;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Llive/hms/video/polls/models/question/HMSPollQuestionType;",
            "Ljava/lang/String;",
            "ZZJI",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
            ">;",
            "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;",
            "Z",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/answer/HmsPollAnswer;",
            ">;)",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;"
        }
    .end annotation

    const-string v0, "type"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myResponses"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/polls/models/question/HMSPollQuestion;

    move/from16 v2, p1

    move/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v15}, Llive/hms/video/polls/models/question/HMSPollQuestion;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/models/question/HMSPollQuestion;

    iget v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->questionID:I

    iget v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->questionID:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->text:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canSkip:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->canSkip:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canChangeResponse:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->canChangeResponse:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->duration:J

    iget-wide v5, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->duration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->weight:I

    iget v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->weight:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerShortMinLength:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerShortMinLength:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerLongMinLength:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerLongMinLength:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->options:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->negative:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->negative:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->myResponses:Ljava/util/List;

    iget-object p1, p1, Llive/hms/video/polls/models/question/HMSPollQuestion;->myResponses:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAnswerLongMinLength()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerLongMinLength:Ljava/lang/Long;

    return-object v0
.end method

.method public final getAnswerShortMinLength()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerShortMinLength:Ljava/lang/Long;

    return-object v0
.end method

.method public final getCanChangeResponse()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canChangeResponse:Z

    return v0
.end method

.method public final getCanSkip()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canSkip:Z

    return v0
.end method

.method public final getCorrectAnswer()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    return-object v0
.end method

.method public final getDuration()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->duration:J

    return-wide v0
.end method

.method public final getMyResponses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/answer/HmsPollAnswer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->myResponses:Ljava/util/List;

    return-object v0
.end method

.method public final getNegative()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->negative:Z

    return v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getQuestionID()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->questionID:I

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotal()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->total:I

    return v0
.end method

.method public final getType()Llive/hms/video/polls/models/question/HMSPollQuestionType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    return-object v0
.end method

.method public final getVoted()Z
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->myResponses:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getWeight()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->weight:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->questionID:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->text:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canSkip:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canChangeResponse:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->duration:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->weight:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerShortMinLength:Ljava/lang/Long;

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

    iget-object v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerLongMinLength:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->options:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->negative:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->myResponses:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setTotal$lib_release(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->total:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSPollQuestion(questionID="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->questionID:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", canSkip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canSkip:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", canChangeResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->canChangeResponse:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->duration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->weight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", answerShortMinLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerShortMinLength:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", answerLongMinLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->answerLongMinLength:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->options:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", correctAnswer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", negative="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->negative:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", myResponses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HMSPollQuestion;->myResponses:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
