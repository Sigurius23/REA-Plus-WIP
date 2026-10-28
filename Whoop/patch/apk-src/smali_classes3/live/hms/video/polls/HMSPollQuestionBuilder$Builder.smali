.class public final Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/polls/HMSPollQuestionBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/polls/HMSPollQuestionBuilder$Builder$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0013\u0010\tJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\rJ\u001d\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001a\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008 \u0010\u0011J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\"\u0010\tJ\r\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010&\u001a\u0004\u0008\'\u0010(R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010)R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010*R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010+R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010,R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010+R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010-R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010+R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010-R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010+R6\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006000/8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106\u00a8\u00067"
    }
    d2 = {
        "Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;",
        "",
        "Llive/hms/video/polls/models/question/HMSPollQuestionType;",
        "type",
        "<init>",
        "(Llive/hms/video/polls/models/question/HMSPollQuestionType;)V",
        "",
        "canBeSkipped",
        "withCanBeSkipped",
        "(Z)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;",
        "",
        "title",
        "withTitle",
        "(Ljava/lang/String;)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;",
        "",
        "duration",
        "withDuration",
        "(J)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;",
        "canChangeResponse",
        "withCanChangeResponse",
        "option",
        "addOption",
        "isCorrect",
        "addQuizOption",
        "(Ljava/lang/String;Z)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;",
        "minLength",
        "withMinLength",
        "",
        "weight",
        "withWeight",
        "(I)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;",
        "maxLength",
        "withMaxLength",
        "answerHidden",
        "withAnswerHidden",
        "Llive/hms/video/polls/HMSPollQuestionBuilder;",
        "build",
        "()Llive/hms/video/polls/HMSPollQuestionBuilder;",
        "Llive/hms/video/polls/models/question/HMSPollQuestionType;",
        "getType",
        "()Llive/hms/video/polls/models/question/HMSPollQuestionType;",
        "I",
        "J",
        "Z",
        "Ljava/lang/String;",
        "Ljava/lang/Long;",
        "negativeMarking",
        "",
        "Ll83/k;",
        "options",
        "Ljava/util/List;",
        "getOptions",
        "()Ljava/util/List;",
        "setOptions",
        "(Ljava/util/List;)V",
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
.field private answerHidden:Z

.field private canBeSkipped:Z

.field private canChangeResponse:Z

.field private duration:J

.field private maxLength:Ljava/lang/Long;

.field private minLength:Ljava/lang/Long;

.field private negativeMarking:Z

.field private options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;

.field private final type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

.field private weight:I


# direct methods
.method public constructor <init>(Llive/hms/video/polls/models/question/HMSPollQuestionType;)V
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    const/4 p1, 0x1

    iput p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->weight:I

    const-string v0, ""

    iput-object v0, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->title:Ljava/lang/String;

    iput-boolean p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->canChangeResponse:Z

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->minLength:Ljava/lang/Long;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->options:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final addOption(Ljava/lang/String;)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 3

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->options:Ljava/util/List;

    new-instance v1, Ll83/k;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final addQuizOption(Ljava/lang/String;Z)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 2

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->options:Ljava/util/List;

    new-instance v1, Ll83/k;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final build()Llive/hms/video/polls/HMSPollQuestionBuilder;
    .locals 21

    move-object/from16 v0, p0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->options:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v12, v2, 0x1

    if-ltz v2, :cond_1

    check-cast v3, Ll83/k;

    iget-object v2, v3, Ll83/k;->w:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Ljava/lang/String;

    iget-object v2, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v11, Llive/hms/video/polls/models/question/HMSPollQuestionOption;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v19, 0x38

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    invoke-direct/range {v11 .. v20}, Llive/hms/video/polls/models/question/HMSPollQuestionOption;-><init>(ILjava/lang/String;Ljava/lang/Integer;ZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v12

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_2
    iget-object v1, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    sget-object v2, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    if-eq v1, v6, :cond_5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    :cond_3
    move-object/from16 v17, v5

    goto :goto_1

    :cond_4
    iget-boolean v2, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->answerHidden:Z

    new-instance v1, Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    const/16 v8, 0x3a

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;-><init>(ZLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v1

    goto :goto_1

    :cond_5
    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v4}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-boolean v12, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->answerHidden:Z

    new-instance v11, Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;-><init>(ZLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v11

    :goto_1
    new-instance v5, Llive/hms/video/polls/HMSPollQuestionBuilder;

    iget-wide v6, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->duration:J

    iget-boolean v8, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->canBeSkipped:Z

    iget-object v9, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->title:Ljava/lang/String;

    move-object/from16 v16, v10

    iget-boolean v10, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->canChangeResponse:Z

    iget-object v11, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->minLength:Ljava/lang/Long;

    iget-object v12, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->maxLength:Ljava/lang/Long;

    iget-boolean v13, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->negativeMarking:Z

    iget-object v14, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    iget v15, v0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->weight:I

    const/16 v18, 0x0

    invoke-direct/range {v5 .. v18}, Llive/hms/video/polls/HMSPollQuestionBuilder;-><init>(JZLjava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;ZLlive/hms/video/polls/models/question/HMSPollQuestionType;ILjava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getType()Llive/hms/video/polls/models/question/HMSPollQuestionType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->type:Llive/hms/video/polls/models/question/HMSPollQuestionType;

    return-object v0
.end method

.method public final setOptions(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->options:Ljava/util/List;

    return-void
.end method

.method public final withAnswerHidden(Z)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->answerHidden:Z

    return-object p0
.end method

.method public final withCanBeSkipped(Z)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->canBeSkipped:Z

    return-object p0
.end method

.method public final withCanChangeResponse(Z)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->canChangeResponse:Z

    return-object p0
.end method

.method public final withDuration(J)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 0

    iput-wide p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->duration:J

    return-object p0
.end method

.method public final withMaxLength(J)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->maxLength:Ljava/lang/Long;

    return-object p0
.end method

.method public final withMinLength(J)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->minLength:Ljava/lang/Long;

    return-object p0
.end method

.method public final withTitle(Ljava/lang/String;)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->title:Ljava/lang/String;

    return-object p0
.end method

.method public final withWeight(I)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;
    .locals 0

    iput p1, p0, Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;->weight:I

    return-object p0
.end method
