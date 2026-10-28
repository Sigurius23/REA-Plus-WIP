.class public final Lds1/l$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lds1/l;->r(Lsr1/e$e;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lds1/l$c;->w:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lds1/l$c;->w:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ltr1/b;

    invoke-virtual {v3}, Ltr1/b;->c()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->getCategory()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Ltr1/b;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ltr1/b;->c()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->getWeeklyPlanGoal()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-result-object p2

    goto :goto_1

    :cond_2
    move-object p2, v2

    :goto_1
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_3

    move p2, v1

    goto :goto_2

    :cond_3
    move p2, v0

    :goto_2
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    check-cast p1, Ljava/lang/String;

    iget-object v3, p0, Lds1/l$c;->w:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ltr1/b;

    invoke-virtual {v5}, Ltr1/b;->c()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->getCategory()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_5
    move-object v4, v2

    :goto_3
    check-cast v4, Ltr1/b;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ltr1/b;->c()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->getWeeklyPlanGoal()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-result-object v2

    :cond_6
    if-eqz v2, :cond_7

    move v0, v1

    :cond_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2, p1}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
