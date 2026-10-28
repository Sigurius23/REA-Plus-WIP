.class public final Llive/hms/video/polls/HMSPollBuilder$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/polls/HMSPollBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000cJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000eJ\u0016\u0010#\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0010J\u0016\u0010%\u001a\u00020\u00002\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0010J\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Llive/hms/video/polls/HMSPollBuilder$Builder;",
        "",
        "<init>",
        "()V",
        "title",
        "",
        "duration",
        "",
        "pollId",
        "anonymous",
        "",
        "pollCategory",
        "Llive/hms/video/polls/models/HmsPollCategory;",
        "mode",
        "Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
        "rolesThatCanVote",
        "",
        "rolesThatCanViewResponses",
        "questionId",
        "",
        "getQuestionId",
        "()I",
        "setQuestionId",
        "(I)V",
        "questions",
        "",
        "Llive/hms/video/polls/models/question/HMSPollQuestion;",
        "withPollId",
        "withTitle",
        "withDuration",
        "withAnonymous",
        "withCategory",
        "category",
        "withUserTrackingMode",
        "userTrackingMode",
        "withRolesThatCanVote",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "withRolesThatCanViewResponses",
        "build",
        "Llive/hms/video/polls/HMSPollBuilder;",
        "addQuestion",
        "withBuilder",
        "Llive/hms/video/polls/HMSPollQuestionBuilder;",
        "addShortAnswerQuestion",
        "addLongAnswerQuestion",
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
.field private anonymous:Z

.field private duration:J

.field private mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

.field private pollCategory:Llive/hms/video/polls/models/HmsPollCategory;

.field private pollId:Ljava/lang/String;

.field private questionId:I

.field private questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;"
        }
    .end annotation
.end field

.field private rolesThatCanViewResponses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private rolesThatCanVote:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Poll"

    iput-object v0, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->title:Ljava/lang/String;

    const-string v0, "toString(...)"

    invoke-static {v0}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->pollId:Ljava/lang/String;

    sget-object v0, Llive/hms/video/polls/models/HmsPollCategory;->QUIZ:Llive/hms/video/polls/models/HmsPollCategory;

    iput-object v0, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->pollCategory:Llive/hms/video/polls/models/HmsPollCategory;

    sget-object v0, Llive/hms/video/polls/models/HmsPollUserTrackingMode;->USER_ID:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    iput-object v0, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    const/4 v0, 0x1

    iput v0, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questionId:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final addLongAnswerQuestion(Ljava/lang/String;)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "withTitle"

    move-object/from16 v5, p1

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Llive/hms/video/polls/models/question/HMSPollQuestion;

    iget v3, v0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questionId:I

    add-int/lit8 v1, v3, 0x1

    iput v1, v0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questionId:I

    sget-object v4, Llive/hms/video/polls/models/question/HMSPollQuestionType;->longAnswer:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    const/16 v17, 0x1ff8

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v18}, Llive/hms/video/polls/models/question/HMSPollQuestion;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questions:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final addQuestion(Llive/hms/video/polls/HMSPollQuestionBuilder;)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "withBuilder"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Llive/hms/video/polls/models/question/HMSPollQuestion;

    iget v3, v0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questionId:I

    add-int/lit8 v1, v3, 0x1

    iput v1, v0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questionId:I

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getType$lib_release()Llive/hms/video/polls/models/question/HMSPollQuestionType;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getTitle$lib_release()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getCanBeSkipped$lib_release()Z

    move-result v6

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getCanChangeResponse$lib_release()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getDuration$lib_release()J

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getWeight$lib_release()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getMinLength$lib_release()Ljava/lang/Long;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getMaxLength$lib_release()Ljava/lang/Long;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getOptions$lib_release()Ljava/util/List;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getCorrectAnswer$lib_release()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/polls/HMSPollQuestionBuilder;->getNegativeMarking$lib_release()Z

    move-result v15

    const/16 v17, 0x1000

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v18}, Llive/hms/video/polls/models/question/HMSPollQuestion;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questions:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final addShortAnswerQuestion(Ljava/lang/String;)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "withTitle"

    move-object/from16 v5, p1

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Llive/hms/video/polls/models/question/HMSPollQuestion;

    iget v3, v0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questionId:I

    add-int/lit8 v1, v3, 0x1

    iput v1, v0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questionId:I

    sget-object v4, Llive/hms/video/polls/models/question/HMSPollQuestionType;->shortAnswer:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    const/16 v17, 0x1ff8

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v18}, Llive/hms/video/polls/models/question/HMSPollQuestion;-><init>(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questions:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final build()Llive/hms/video/polls/HMSPollBuilder;
    .locals 12

    new-instance v0, Llive/hms/video/polls/HMSPollBuilder;

    iget-object v1, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->title:Ljava/lang/String;

    iget-wide v2, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->duration:J

    iget-object v4, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->pollId:Ljava/lang/String;

    iget-boolean v5, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->anonymous:Z

    iget-object v6, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->pollCategory:Llive/hms/video/polls/models/HmsPollCategory;

    iget-object v7, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    iget-object v8, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->rolesThatCanVote:Ljava/util/List;

    iget-object v9, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->rolesThatCanViewResponses:Ljava/util/List;

    iget-object v10, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questions:Ljava/util/List;

    const/4 v11, 0x0

    invoke-direct/range {v0 .. v11}, Llive/hms/video/polls/HMSPollBuilder;-><init>(Ljava/lang/String;JLjava/lang/String;ZLlive/hms/video/polls/models/HmsPollCategory;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final getQuestionId()I
    .locals 1

    iget v0, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questionId:I

    return v0
.end method

.method public final setQuestionId(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->questionId:I

    return-void
.end method

.method public final withAnonymous(Z)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->anonymous:Z

    return-object p0
.end method

.method public final withCategory(Llive/hms/video/polls/models/HmsPollCategory;)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 1

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->pollCategory:Llive/hms/video/polls/models/HmsPollCategory;

    return-object p0
.end method

.method public final withDuration(J)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 0

    iput-wide p1, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->duration:J

    return-object p0
.end method

.method public final withPollId(Ljava/lang/String;)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 1

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->pollId:Ljava/lang/String;

    return-object p0
.end method

.method public final withRolesThatCanViewResponses(Ljava/util/List;)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;)",
            "Llive/hms/video/polls/HMSPollBuilder$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    iput-object v0, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->rolesThatCanViewResponses:Ljava/util/List;

    return-object p0
.end method

.method public final withRolesThatCanVote(Ljava/util/List;)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;)",
            "Llive/hms/video/polls/HMSPollBuilder$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    iput-object v0, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->rolesThatCanVote:Ljava/util/List;

    return-object p0
.end method

.method public final withTitle(Ljava/lang/String;)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->title:Ljava/lang/String;

    return-object p0
.end method

.method public final withUserTrackingMode(Llive/hms/video/polls/models/HmsPollUserTrackingMode;)Llive/hms/video/polls/HMSPollBuilder$Builder;
    .locals 1

    const-string v0, "userTrackingMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollBuilder$Builder;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    return-object p0
.end method
