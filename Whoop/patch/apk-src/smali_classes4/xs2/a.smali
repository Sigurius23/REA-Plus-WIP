.class public final Lxs2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo02/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxs2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lxs2/a;",
        "Lo02/d;",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "Lj02/m0;",
        "c",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;",
        "a",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
    .locals 0

    invoke-virtual {p0, p1}, Lxs2/a;->c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b(Ljava/util/List;Ljava/util/Map;)Lo02/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo02/d;",
            ">;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lkotlin/jvm/functions/Function1;",
            ">;)",
            "Lo02/d;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo02/d;->b(Ljava/util/List;Ljava/util/Map;)Lo02/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;
    .locals 12

    const-string v0, "navigationScreenModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;

    invoke-virtual {p1}, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;->getPlanEditScreens()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v4, Lxs2/a$a;->UNKNOWN:Lxs2/a$a;

    invoke-static {}, Lxs2/a$a;->values()[Lxs2/a$a;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_2

    goto :goto_3

    :cond_2
    move-object v4, v8

    :goto_3
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    sget-object v0, Lxs2/a$a;->UNKNOWN:Lxs2/a$a;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    sget-object v3, Lxs2/a$a;->STEPS:Lxs2/a$a;

    sget-object v4, Lxs2/a$a;->SLEEP_PERFORMANCE:Lxs2/a$a;

    sget-object v5, Lxs2/a$a;->STRAIN:Lxs2/a$a;

    sget-object v6, Lxs2/a$a;->ACTIVITIES:Lxs2/a$a;

    sget-object v7, Lxs2/a$a;->BEHAVIORS:Lxs2/a$a;

    sget-object v8, Lxs2/a$a;->WEIGHT:Lxs2/a$a;

    sget-object v9, Lxs2/a$a;->HR_ZONES_ONE_TO_THREE:Lxs2/a$a;

    sget-object v10, Lxs2/a$a;->HR_ZONES_FOUR_TO_FIVE:Lxs2/a$a;

    sget-object v11, Lxs2/a$a;->STRENGTH_TRAINING_TIME:Lxs2/a$a;

    filled-new-array/range {v3 .. v11}, [Lxs2/a$a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_5
    check-cast v1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxs2/a$a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    new-instance v1, Lj02/m0$r5;

    invoke-virtual {p1}, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;->getAnalyticsSource()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lj02/m0$r5;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v1

    :cond_7
    sget-object p1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object p1
.end method
