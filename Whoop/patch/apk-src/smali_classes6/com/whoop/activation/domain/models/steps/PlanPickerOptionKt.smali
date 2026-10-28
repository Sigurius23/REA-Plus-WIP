.class public final Lcom/whoop/activation/domain/models/steps/PlanPickerOptionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a-\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0012\u0004\u0012\u0002H\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "selectedFor",
        "T",
        "Lcom/whoop/activation/domain/models/steps/PlanPickerOption;",
        "",
        "commitmentType",
        "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "(Ljava/util/List;Lcom/whoop/activation/domain/models/steps/CommitmentType;)Lcom/whoop/activation/domain/models/steps/PlanPickerOption;",
        "activation_release"
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
.method public static final selectedFor(Ljava/util/List;Lcom/whoop/activation/domain/models/steps/CommitmentType;)Lcom/whoop/activation/domain/models/steps/PlanPickerOption;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/whoop/activation/domain/models/steps/PlanPickerOption;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
            ")TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p1, :cond_2

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/whoop/activation/domain/models/steps/PlanPickerOption;

    invoke-interface {v1}, Lcom/whoop/activation/domain/models/steps/PlanPickerOption;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v0, p1

    :cond_1
    check-cast v0, Lcom/whoop/activation/domain/models/steps/PlanPickerOption;

    return-object v0

    :cond_2
    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/activation/domain/models/steps/PlanPickerOption;

    invoke-interface {v2}, Lcom/whoop/activation/domain/models/steps/PlanPickerOption;->getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v2

    if-ne v2, p1, :cond_3

    move-object v0, v1

    :cond_4
    check-cast v0, Lcom/whoop/activation/domain/models/steps/PlanPickerOption;

    return-object v0
.end method
