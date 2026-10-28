.class public final Llive/hms/video/polls/HMSPollResponseBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0010H\u0000\u00a2\u0006\u0002\u0008\u0011J-\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00102\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u0019J\'\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u001bJ\'\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00052\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/polls/HMSPollResponseBuilder;",
        "",
        "hmsPoll",
        "Llive/hms/video/polls/models/HmsPoll;",
        "userId",
        "",
        "<init>",
        "(Llive/hms/video/polls/models/HmsPoll;Ljava/lang/String;)V",
        "getHmsPoll",
        "()Llive/hms/video/polls/models/HmsPoll;",
        "getUserId",
        "()Ljava/lang/String;",
        "answers",
        "",
        "Llive/hms/video/polls/models/answer/HmsPollAnswer;",
        "getAllAnswers",
        "",
        "getAllAnswers$lib_release",
        "addResponse",
        "forQuestion",
        "Llive/hms/video/polls/models/question/HMSPollQuestion;",
        "options",
        "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
        "durationMillis",
        "",
        "(Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/util/List;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;",
        "option",
        "(Llive/hms/video/polls/models/question/HMSPollQuestion;Llive/hms/video/polls/models/question/HMSPollQuestionOption;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;",
        "forOpenQuestion",
        "text",
        "(Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/lang/String;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;",
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
.field private final answers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/answer/HmsPollAnswer;",
            ">;"
        }
    .end annotation
.end field

.field private final hmsPoll:Llive/hms/video/polls/models/HmsPoll;

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Llive/hms/video/polls/models/HmsPoll;Ljava/lang/String;)V
    .locals 1

    const-string v0, "hmsPoll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollResponseBuilder;->hmsPoll:Llive/hms/video/polls/models/HmsPoll;

    iput-object p2, p0, Llive/hms/video/polls/HMSPollResponseBuilder;->userId:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollResponseBuilder;->answers:Ljava/util/List;

    return-void
.end method

.method public static synthetic addResponse$default(Llive/hms/video/polls/HMSPollResponseBuilder;Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)Llive/hms/video/polls/HMSPollResponseBuilder;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 3
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/polls/HMSPollResponseBuilder;->addResponse(Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/lang/String;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addResponse$default(Llive/hms/video/polls/HMSPollResponseBuilder;Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/util/List;Ljava/lang/Long;ILjava/lang/Object;)Llive/hms/video/polls/HMSPollResponseBuilder;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/polls/HMSPollResponseBuilder;->addResponse(Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/util/List;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addResponse$default(Llive/hms/video/polls/HMSPollResponseBuilder;Llive/hms/video/polls/models/question/HMSPollQuestion;Llive/hms/video/polls/models/question/HMSPollQuestionOption;Ljava/lang/Long;ILjava/lang/Object;)Llive/hms/video/polls/HMSPollResponseBuilder;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/polls/HMSPollResponseBuilder;->addResponse(Llive/hms/video/polls/models/question/HMSPollQuestion;Llive/hms/video/polls/models/question/HMSPollQuestionOption;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addResponse(Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/lang/String;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;
    .locals 12

    const-string v0, "forOpenQuestion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getType()Llive/hms/video/polls/models/question/HMSPollQuestionType;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSPollResponseBuilder"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    iget-object v0, p0, Llive/hms/video/polls/HMSPollResponseBuilder;->answers:Ljava/util/List;

    new-instance v1, Llive/hms/video/polls/models/answer/HmsPollAnswer;

    invoke-virtual {p1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getQuestionID()I

    move-result v2

    invoke-virtual {p1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getType()Llive/hms/video/polls/models/question/HMSPollQuestionType;

    move-result-object v3

    const/16 v10, 0x5c

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v7, p2

    move-object v9, p3

    invoke-direct/range {v1 .. v11}, Llive/hms/video/polls/models/answer/HmsPollAnswer;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;ZILjava/util/List;Ljava/lang/String;ZLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final addResponse(Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/util/List;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestionOption;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Llive/hms/video/polls/HMSPollResponseBuilder;"
        }
    .end annotation

    const-string v0, "forQuestion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Llive/hms/video/polls/HMSPollResponseBuilder;->answers:Ljava/util/List;

    invoke-virtual {p1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getQuestionID()I

    move-result v2

    invoke-virtual {p1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getType()Llive/hms/video/polls/models/question/HMSPollQuestionType;

    move-result-object v3

    check-cast p2, Ljava/lang/Iterable;

    .line 2
    new-instance v6, Ljava/util/ArrayList;

    const/16 p1, 0xa

    invoke-static {p2, p1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-direct {v6, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 4
    check-cast p2, Llive/hms/video/polls/models/question/HMSPollQuestionOption;

    .line 5
    invoke-virtual {p2}, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->getIndex()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 6
    invoke-interface {v6, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Llive/hms/video/polls/models/answer/HmsPollAnswer;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v10, 0x6c

    const/4 v11, 0x0

    move-object v9, p3

    invoke-direct/range {v1 .. v11}, Llive/hms/video/polls/models/answer/HmsPollAnswer;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;ZILjava/util/List;Ljava/lang/String;ZLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final addResponse(Llive/hms/video/polls/models/question/HMSPollQuestion;Llive/hms/video/polls/models/question/HMSPollQuestionOption;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;
    .locals 12

    const-string v0, "forQuestion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Llive/hms/video/polls/HMSPollResponseBuilder;->answers:Ljava/util/List;

    new-instance v1, Llive/hms/video/polls/models/answer/HmsPollAnswer;

    invoke-virtual {p1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getQuestionID()I

    move-result v2

    invoke-virtual {p1}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getType()Llive/hms/video/polls/models/question/HMSPollQuestionType;

    move-result-object v3

    invoke-virtual {p2}, Llive/hms/video/polls/models/question/HMSPollQuestionOption;->getIndex()I

    move-result v5

    const/16 v10, 0x74

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, p3

    invoke-direct/range {v1 .. v11}, Llive/hms/video/polls/models/answer/HmsPollAnswer;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;ZILjava/util/List;Ljava/lang/String;ZLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final getAllAnswers$lib_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/answer/HmsPollAnswer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/HMSPollResponseBuilder;->answers:Ljava/util/List;

    return-object v0
.end method

.method public final getHmsPoll()Llive/hms/video/polls/models/HmsPoll;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/HMSPollResponseBuilder;->hmsPoll:Llive/hms/video/polls/models/HmsPoll;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/HMSPollResponseBuilder;->userId:Ljava/lang/String;

    return-object v0
.end method
