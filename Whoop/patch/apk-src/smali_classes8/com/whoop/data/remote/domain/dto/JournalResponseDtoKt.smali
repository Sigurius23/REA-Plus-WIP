.class public final Lcom/whoop/data/remote/domain/dto/JournalResponseDtoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "convertToQuestionTypeEnum",
        "Lcom/whoop/data/remote/domain/dto/QuestionType;",
        "questionType",
        "",
        "convertToCircularProgressStyleEnum",
        "Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;",
        "style",
        "core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$convertToCircularProgressStyleEnum(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/remote/domain/dto/JournalResponseDtoKt;->convertToCircularProgressStyleEnum(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$convertToQuestionTypeEnum(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/QuestionType;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/remote/domain/dto/JournalResponseDtoKt;->convertToQuestionTypeEnum(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/QuestionType;

    move-result-object p0

    return-object p0
.end method

.method private static final convertToCircularProgressStyleEnum(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;
    .locals 1

    const-string v0, "WEEKLY_PLAN_IN_PROGRESS"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_IN_PROGRESS:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    return-object p0

    :cond_0
    sget-object p0, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    return-object p0
.end method

.method private static final convertToQuestionTypeEnum(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/QuestionType;
    .locals 1

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "MAGNITUDE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/whoop/data/remote/domain/dto/QuestionType;->MAGNITUDE:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object p0

    :sswitch_1
    const-string v0, "LEVEL"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/whoop/data/remote/domain/dto/QuestionType;->LEVEL:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object p0

    :sswitch_2
    const-string v0, "FREEFORM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p0, Lcom/whoop/data/remote/domain/dto/QuestionType;->FREEFORM:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object p0

    :sswitch_3
    const-string v0, "YES_NO"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Lcom/whoop/data/remote/domain/dto/QuestionType;->YES_NO:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object p0

    :sswitch_4
    const-string v0, "TOGGLE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    sget-object p0, Lcom/whoop/data/remote/domain/dto/QuestionType;->TOGGLE:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object p0

    :cond_5
    :goto_0
    const/4 p0, 0x0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x6c2e50ac -> :sswitch_4
        -0x642d31c7 -> :sswitch_3
        -0x2d0302d0 -> :sswitch_2
        0x44fa364 -> :sswitch_1
        0x2de261f0 -> :sswitch_0
    .end sparse-switch
.end method
