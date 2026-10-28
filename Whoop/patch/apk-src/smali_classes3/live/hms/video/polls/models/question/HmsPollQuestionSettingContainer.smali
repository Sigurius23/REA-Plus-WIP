.class public final Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nB\u0011\u0008\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\t\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;",
        "",
        "questionContainer",
        "Llive/hms/video/polls/models/question/HmsPollQuestionCreation;",
        "options",
        "",
        "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
        "correctAnswer",
        "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;",
        "<init>",
        "(Llive/hms/video/polls/models/question/HmsPollQuestionCreation;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;)V",
        "question",
        "Llive/hms/video/polls/models/question/HMSPollQuestion;",
        "(Llive/hms/video/polls/models/question/HMSPollQuestion;)V",
        "getQuestionContainer",
        "()Llive/hms/video/polls/models/question/HmsPollQuestionCreation;",
        "getOptions",
        "()Ljava/util/List;",
        "getCorrectAnswer",
        "()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;",
        "component1",
        "component2",
        "component3",
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
.field private final correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "answer"
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

.field private final questionContainer:Llive/hms/video/polls/models/question/HmsPollQuestionCreation;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "question"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/polls/models/question/HMSPollQuestion;)V
    .locals 2

    const-string v0, "question"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    invoke-direct {v0, p1}, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;-><init>(Llive/hms/video/polls/models/question/HMSPollQuestion;)V

    .line 6
    invoke-virtual {p1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getOptions()Ljava/util/List;

    move-result-object v1

    .line 7
    invoke-virtual {p1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getCorrectAnswer()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    move-result-object p1

    .line 8
    invoke-direct {p0, v0, v1, p1}, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;-><init>(Llive/hms/video/polls/models/question/HmsPollQuestionCreation;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;)V

    return-void
.end method

.method public constructor <init>(Llive/hms/video/polls/models/question/HmsPollQuestionCreation;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/question/HmsPollQuestionCreation;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
            ">;",
            "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;",
            ")V"
        }
    .end annotation

    const-string v0, "questionContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->questionContainer:Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    .line 3
    iput-object p2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->options:Ljava/util/List;

    .line 4
    iput-object p3, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;Llive/hms/video/polls/models/question/HmsPollQuestionCreation;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ILjava/lang/Object;)Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->questionContainer:Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->options:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->copy(Llive/hms/video/polls/models/question/HmsPollQuestionCreation;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;)Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/polls/models/question/HmsPollQuestionCreation;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->questionContainer:Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->options:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    return-object v0
.end method

.method public final copy(Llive/hms/video/polls/models/question/HmsPollQuestionCreation;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;)Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/question/HmsPollQuestionCreation;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
            ">;",
            "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;",
            ")",
            "Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;"
        }
    .end annotation

    const-string v0, "questionContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;-><init>(Llive/hms/video/polls/models/question/HmsPollQuestionCreation;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->questionContainer:Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->questionContainer:Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->options:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    iget-object p1, p1, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCorrectAnswer()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    return-object v0
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

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getQuestionContainer()Llive/hms/video/polls/models/question/HmsPollQuestionCreation;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->questionContainer:Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->questionContainer:Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    invoke-virtual {v0}, Llive/hms/video/polls/models/question/HmsPollQuestionCreation;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->options:Ljava/util/List;

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

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HmsPollQuestionSettingContainer(questionContainer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->questionContainer:Llive/hms/video/polls/models/question/HmsPollQuestionCreation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->options:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", correctAnswer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;->correctAnswer:Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
