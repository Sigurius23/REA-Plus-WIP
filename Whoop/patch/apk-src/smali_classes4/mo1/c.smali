.class public abstract Lmo1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0008*\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Llb1/z0;",
        "Lkotlin/Function0;",
        "Lmo1/d;",
        "trackedBehaviorReducer",
        "Ll83/a0;",
        "b",
        "(Llb1/z0;Lc93/a;)V",
        "Lcom/whoop/design/models/items/TrackedBehaviorModel;",
        "Lw71/k0;",
        "d",
        "(Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/k0;",
        "hormonal-insights_release"
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
.method public static synthetic a(Lc93/a;Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/t;
    .locals 0

    invoke-static {p0, p1}, Lmo1/c;->c(Lc93/a;Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/t;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Llb1/z0;Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llb1/z0;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackedBehaviorReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/room/o0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Landroidx/room/o0;-><init>(Lc93/a;I)V

    const-class p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v1, Lmo1/c$a;

    invoke-direct {v1, v0}, Lmo1/c$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1, v1}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final c(Lc93/a;Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/t;
    .locals 10

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmo1/d;

    invoke-virtual {p0, p1}, Lmo1/d;->h(Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/t;

    move-result-object v0

    sget-object v6, Lv41/f0;->FilledCard:Lv41/f0;

    invoke-static {p1}, Lmo1/c;->d(Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/k0;

    move-result-object v7

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Lw71/t;->c(Lw71/t;Lw71/y;Ljava/util/List;ZZZLv41/f0;Lw71/k0;ILjava/lang/Object;)Lw71/t;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/k0;
    .locals 12

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getStateKey()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    move-object v2, v0

    new-instance v0, Lw71/k0;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getBehaviorTracker()Lcom/whoop/design/models/items/BehaviorTrackerModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->getId()I

    move-result v3

    move-object v4, v2

    move v2, v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested()Z

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getTrackerInput()Lcom/whoop/design/models/items/TrackerInputModel;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/whoop/design/models/items/TrackerInputModel;->getAnsweredYes()Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object v5, v4

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getTrackerInput()Lcom/whoop/design/models/items/TrackerInputModel;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/whoop/design/models/items/TrackerInputModel;->getMagnitudeInputValue()Ljava/lang/Double;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v4

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getTrackerInput()Lcom/whoop/design/models/items/TrackerInputModel;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lcom/whoop/design/models/items/TrackerInputModel;->getMagnitudeInputLabel()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_3
    move-object v7, v4

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getTrackerInput()Lcom/whoop/design/models/items/TrackerInputModel;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lcom/whoop/design/models/items/TrackerInputModel;->getTimeInputValue()Ljava/lang/Long;

    move-result-object v8

    goto :goto_3

    :cond_4
    move-object v8, v4

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getTrackerInput()Lcom/whoop/design/models/items/TrackerInputModel;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackerInputModel;->getTimeInputLabel()Ljava/lang/String;

    move-result-object p0

    goto :goto_4

    :cond_5
    move-object p0, v4

    :goto_4
    const/16 v10, 0x100

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, p0

    invoke-direct/range {v0 .. v11}, Lw71/k0;-><init>(Ljava/lang/String;IZLjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
