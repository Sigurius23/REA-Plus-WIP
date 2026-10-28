.class public abstract Lds1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lds1/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\'\u0010\n\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;",
        "tracker",
        "",
        "a",
        "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;)I",
        "",
        "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;",
        "magnitudeList",
        "curValue",
        "",
        "b",
        "(Ljava/util/List;Ljava/lang/Integer;)Ljava/lang/String;",
        "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;",
        "magnitude",
        "c",
        "(Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;)Ljava/lang/String;",
        "journal_release"
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
.method public static final a(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;)I
    .locals 3

    const-string v0, "tracker"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->getMagnitude()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->getStepValues()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x1

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;->getValue()F

    move-result v0

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;->getValue()F

    move-result p0

    sub-float/2addr v0, p0

    float-to-int p0, v0

    return p0

    :cond_1
    return v0
.end method

.method public static final b(Ljava/util/List;Ljava/lang/Integer;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p0, :cond_5

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;->getValue()F

    move-result v2

    float-to-int v2, v2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;->getLabel()Ljava/lang/String;

    move-result-object v1

    :cond_3
    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    return-object v1

    :cond_5
    :goto_2
    const-string p0, ""

    return-object p0
.end method

.method public static final c(Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->getQuestionType()Lcom/whoop/data/remote/domain/dto/QuestionType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    sget-object v1, Lds1/m$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_1
    const/4 v1, 0x1

    const-string v2, ""

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->getUnits()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v2

    :cond_2
    return-object p0

    :cond_3
    return-object v2
.end method
