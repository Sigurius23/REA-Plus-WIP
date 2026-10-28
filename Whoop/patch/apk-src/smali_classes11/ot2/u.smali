.class public abstract Lot2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ljt2/d;",
        "accumulator",
        "",
        "a",
        "(Ljt2/d;)Z",
        "weekly-plan_release"
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
.method public static final a(Ljt2/d;)Z
    .locals 4

    const-string v0, "accumulator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljt2/d;->r()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljt2/r;

    invoke-virtual {v0}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v2

    sget-object v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->SLEEP_PERFORMANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-eq v2, v3, :cond_2

    invoke-virtual {v0}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v2

    sget-object v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->SLEEP_HOURS:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-eq v2, v3, :cond_2

    invoke-virtual {v0}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v0

    sget-object v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->SLEEP_CONSISTENCY:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-ne v0, v2, :cond_1

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    return v1
.end method
