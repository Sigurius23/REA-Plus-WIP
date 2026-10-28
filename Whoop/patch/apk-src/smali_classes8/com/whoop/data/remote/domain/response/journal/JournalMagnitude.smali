.class public final Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BY\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003Jp\u0010&\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\u0014\u0010(\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010+\u001a\u00020,H\u00d6\u0081\u0004J\n\u0010-\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\u0008\u0016\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\u0008\u0017\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006."
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;",
        "",
        "intervalSize",
        "",
        "label",
        "",
        "maxInclusive",
        "minInclusive",
        "type",
        "units",
        "stepValues",
        "",
        "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;",
        "questionType",
        "Lcom/whoop/data/remote/domain/dto/QuestionType;",
        "<init>",
        "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;)V",
        "getIntervalSize",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getLabel",
        "()Ljava/lang/String;",
        "getMaxInclusive",
        "getMinInclusive",
        "getType",
        "getUnits",
        "getStepValues",
        "()Ljava/util/List;",
        "getQuestionType",
        "()Lcom/whoop/data/remote/domain/dto/QuestionType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;)Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final intervalSize:Ljava/lang/Float;

.field private final label:Ljava/lang/String;

.field private final maxInclusive:Ljava/lang/Float;

.field private final minInclusive:Ljava/lang/Float;

.field private final questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

.field private final stepValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/String;

.field private final units:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;",
            ">;",
            "Lcom/whoop/data/remote/domain/dto/QuestionType;",
            ")V"
        }
    .end annotation

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->intervalSize:Ljava/lang/Float;

    iput-object p2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->label:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->maxInclusive:Ljava/lang/Float;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->minInclusive:Ljava/lang/Float;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->type:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->units:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->stepValues:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->intervalSize:Ljava/lang/Float;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->label:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->maxInclusive:Ljava/lang/Float;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->minInclusive:Ljava/lang/Float;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->type:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->units:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->stepValues:Ljava/util/List;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->copy(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;)Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->intervalSize:Ljava/lang/Float;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->maxInclusive:Ljava/lang/Float;

    return-object v0
.end method

.method public final component4()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->minInclusive:Ljava/lang/Float;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->units:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->stepValues:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/data/remote/domain/dto/QuestionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object v0
.end method

.method public final copy(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;)Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;",
            ">;",
            "Lcom/whoop/data/remote/domain/dto/QuestionType;",
            ")",
            "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;"
        }
    .end annotation

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;-><init>(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->intervalSize:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->intervalSize:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->maxInclusive:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->maxInclusive:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->minInclusive:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->minInclusive:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->units:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->units:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->stepValues:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->stepValues:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getIntervalSize()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->intervalSize:Ljava/lang/Float;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxInclusive()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->maxInclusive:Ljava/lang/Float;

    return-object v0
.end method

.method public final getMinInclusive()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->minInclusive:Ljava/lang/Float;

    return-object v0
.end method

.method public final getQuestionType()Lcom/whoop/data/remote/domain/dto/QuestionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object v0
.end method

.method public final getStepValues()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->stepValues:Ljava/util/List;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnits()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->units:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->intervalSize:Ljava/lang/Float;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->label:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->maxInclusive:Ljava/lang/Float;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->minInclusive:Ljava/lang/Float;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->type:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->units:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->stepValues:Ljava/util/List;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->intervalSize:Ljava/lang/Float;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->maxInclusive:Ljava/lang/Float;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->minInclusive:Ljava/lang/Float;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->type:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->units:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->stepValues:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "JournalMagnitude(intervalSize="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", maxInclusive="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", minInclusive="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", units="

    const-string v1, ", stepValues="

    invoke-static {v8, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", questionType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
