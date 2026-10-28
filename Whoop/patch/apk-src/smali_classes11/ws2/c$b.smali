.class final Lws2/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lws2/c;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lws2/d;",
        "previousState",
        "Lws2/e;",
        "action",
        "<anonymous>",
        "(Lws2/d;Lws2/e;)Lws2/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanDomainCombiner$interact$2"
    f = "CustomizePlanDomainCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lws2/c;


# direct methods
.method public constructor <init>(Lws2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lws2/c;",
            "Lq83/d<",
            "-",
            "Lws2/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lws2/c$b;->z:Lws2/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lws2/d;Lws2/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lws2/d;",
            "Lws2/e;",
            "Lq83/d<",
            "-",
            "Lws2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lws2/c$b;

    iget-object v1, p0, Lws2/c$b;->z:Lws2/c;

    invoke-direct {v0, v1, p3}, Lws2/c$b;-><init>(Lws2/c;Lq83/d;)V

    iput-object p1, v0, Lws2/c$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lws2/c$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lws2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lws2/d;

    check-cast p2, Lws2/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lws2/c$b;->f(Lws2/d;Lws2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 50

    move-object/from16 v0, p0

    iget-object v1, v0, Lws2/c$b;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lws2/d;

    iget-object v1, v0, Lws2/c$b;->y:Ljava/lang/Object;

    check-cast v1, Lws2/e;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lws2/c$b;->w:I

    if-nez v3, :cond_61

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lws2/e$e;

    if-eqz v3, :cond_0

    new-instance v3, Lws2/h$b;

    check-cast v1, Lws2/e$e;

    invoke-virtual {v1}, Lws2/e$e;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, Lws2/h$b;-><init>(Ljava/util/List;)V

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v3, v1, Lws2/e$c;

    if-eqz v3, :cond_1

    new-instance v3, Lws2/h$a;

    check-cast v1, Lws2/e$c;

    invoke-virtual {v1}, Lws2/e$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lws2/e$c;->b()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lws2/h$a;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_1
    instance-of v3, v1, Lws2/e$j;

    if-eqz v3, :cond_2

    new-instance v3, Lws2/h$f;

    check-cast v1, Lws2/e$j;

    invoke-virtual {v1}, Lws2/e$j;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lws2/e$j;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lws2/h$f;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;)V

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_2
    instance-of v3, v1, Lws2/e$m;

    sget-object v4, Lm83/y;->w:Lm83/y;

    const/4 v5, 0x0

    const/16 v6, 0xa

    if-eqz v3, :cond_6

    check-cast v1, Lws2/e$m;

    invoke-virtual {v1}, Lws2/e$m;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v3

    invoke-static {v5, v3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v6}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    move-object v10, v4

    sget-object v3, Lws2/h$i;->a:Lws2/h$i;

    new-instance v11, Lws2/g;

    invoke-virtual {v1}, Lws2/e$m;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lws2/g;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v11

    invoke-virtual {v1}, Lws2/e$m;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v6

    invoke-virtual {v1}, Lws2/e$m;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v1

    invoke-static {v5, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomSheet()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    move-result-object v7

    if-eqz v7, :cond_4

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lsw0/h;->c(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lsw0/g;

    move-result-object v1

    if-nez v1, :cond_5

    :cond_4
    new-instance v7, Lsw0/g;

    const/16 v20, 0xfff

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v7 .. v21}, Lsw0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v7

    :cond_5
    invoke-virtual {v2, v3, v4, v6, v1}, Lws2/d;->a(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v1, Lws2/e$l;

    if-eqz v3, :cond_7

    new-instance v3, Lws2/h$h;

    invoke-virtual {v2}, Lws2/d;->d()Lws2/g;

    move-result-object v1

    invoke-virtual {v1}, Lws2/g;->c()Z

    move-result v1

    invoke-direct {v3, v1}, Lws2/h$h;-><init>(Z)V

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v3, v1, Lws2/e$k;

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Lws2/d;->d()Lws2/g;

    move-result-object v1

    invoke-virtual {v1}, Lws2/g;->c()Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v3, Lws2/h$g;->a:Lws2/h$g;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_8
    iget-object v1, v0, Lws2/c$b;->z:Lws2/c;

    invoke-static {v1, v2, v5}, Lws2/c;->f(Lws2/c;Lws2/d;Z)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_9
    instance-of v3, v1, Lws2/e$h;

    if-eqz v3, :cond_a

    new-instance v3, Lws2/h$e;

    invoke-virtual {v2}, Lws2/d;->d()Lws2/g;

    move-result-object v1

    invoke-virtual {v1}, Lws2/g;->c()Z

    move-result v1

    invoke-direct {v3, v1}, Lws2/h$e;-><init>(Z)V

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_a
    instance-of v3, v1, Lws2/e$g;

    const/4 v7, 0x1

    if-eqz v3, :cond_c

    invoke-virtual {v2}, Lws2/d;->d()Lws2/g;

    move-result-object v1

    invoke-virtual {v1}, Lws2/g;->c()Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v3, Lws2/h$d;->a:Lws2/h$d;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_b
    iget-object v1, v0, Lws2/c$b;->z:Lws2/c;

    invoke-static {v1, v2, v7}, Lws2/c;->f(Lws2/c;Lws2/d;Z)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_c
    instance-of v3, v1, Lws2/e$q;

    const/4 v8, 0x0

    if-eqz v3, :cond_10

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v3

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    move-object v6, v1

    check-cast v6, Lws2/e$q;

    invoke-virtual {v6}, Lws2/e$q;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v10

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v11

    if-ne v10, v11, :cond_e

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v12

    if-eqz v12, :cond_d

    invoke-virtual {v6}, Lws2/e$q;->b()D

    move-result-wide v17

    const/16 v26, 0x7f7

    const/16 v27, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v12 .. v27}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v6

    move-object v11, v6

    goto :goto_2

    :cond_d
    move-object v11, v8

    :goto_2
    const/16 v22, 0xffd

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    move-result-object v9

    :cond_e
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_f
    invoke-static {v3, v8, v5, v7, v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Ljava/util/UUID;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v5

    const/16 v7, 0xb

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_10
    instance-of v3, v1, Lws2/e$o;

    if-eqz v3, :cond_1b

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v3

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v5, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    move-object v10, v1

    check-cast v10, Lws2/e$o;

    invoke-virtual {v10}, Lws2/e$o;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v12

    invoke-virtual {v11}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v13

    if-ne v12, v13, :cond_19

    invoke-virtual {v11}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v14

    if-eqz v14, :cond_18

    invoke-virtual {v11}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v12

    if-nez v12, :cond_11

    move-object v12, v4

    :cond_11
    check-cast v12, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v12, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_14

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v10}, Lws2/e$o;->b()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-virtual {v10}, Lws2/e$o;->b()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v10}, Lws2/e$o;->e()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-virtual {v10}, Lws2/e$o;->c()I

    move-result v7

    new-instance v15, Ljava/lang/Integer;

    invoke-direct {v15, v7}, Ljava/lang/Integer;-><init>(I)V

    move-object/from16 v22, v15

    goto :goto_5

    :cond_12
    move-object/from16 v22, v8

    :goto_5
    invoke-virtual {v10}, Lws2/e$o;->d()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v24

    const/16 v28, 0x65f

    const/16 v29, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v16 .. v29}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->copy$default(Lcom/whoop/design/models/items/GoalSettingsTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;ILjava/lang/Object;)Lcom/whoop/design/models/items/GoalSettingsTileModel;

    move-result-object v16

    :cond_13
    move-object/from16 v7, v16

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x1

    goto :goto_4

    :cond_14
    invoke-virtual {v11}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v7, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v12, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_17

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v10}, Lws2/e$o;->b()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v10}, Lws2/e$o;->b()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v10}, Lws2/e$o;->e()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-virtual {v10}, Lws2/e$o;->c()I

    move-result v6

    new-instance v15, Ljava/lang/Integer;

    invoke-direct {v15, v6}, Ljava/lang/Integer;-><init>(I)V

    move-object/from16 v22, v15

    goto :goto_7

    :cond_15
    move-object/from16 v22, v8

    :goto_7
    invoke-virtual {v10}, Lws2/e$o;->d()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v24

    const/16 v28, 0x65f

    const/16 v29, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v16 .. v29}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->copy$default(Lcom/whoop/design/models/items/GoalSettingsTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;ILjava/lang/Object;)Lcom/whoop/design/models/items/GoalSettingsTileModel;

    move-result-object v16

    :cond_16
    move-object/from16 v6, v16

    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v6, 0xa

    goto :goto_6

    :cond_17
    const/16 v23, 0xed

    const/16 v24, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v12

    move-object/from16 v16, v13

    invoke-static/range {v14 .. v24}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v6

    move-object v14, v6

    goto :goto_8

    :cond_18
    move-object v14, v8

    :goto_8
    const/16 v24, 0xffb

    const/16 v25, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v11 .. v25}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    move-result-object v11

    :cond_19
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v6, 0xa

    const/4 v7, 0x1

    goto/16 :goto_3

    :cond_1a
    move v6, v7

    invoke-static {v3, v8, v9, v6, v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Ljava/util/UUID;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v5

    const/16 v7, 0xb

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_1b
    instance-of v3, v1, Lws2/e$d;

    if-eqz v3, :cond_23

    iget-object v1, v0, Lws2/c$b;->z:Lws2/c;

    invoke-static {v1}, Lws2/c;->g(Lws2/c;)Lws2/f;

    move-result-object v1

    invoke-virtual {v2}, Lws2/d;->d()Lws2/g;

    move-result-object v3

    const/4 v6, 0x1

    invoke-virtual {v1, v3, v6}, Lws2/f;->a(Lws2/g;I)Lws2/g;

    move-result-object v1

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lws2/g;->a()I

    move-result v5

    invoke-static {v5, v3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-eqz v3, :cond_1c

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_1c

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v3

    goto :goto_9

    :cond_1c
    move-object v3, v8

    :goto_9
    if-nez v3, :cond_1d

    move-object v3, v4

    :cond_1d
    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1}, Lws2/g;->a()I

    move-result v6

    invoke-static {v6, v5}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-eqz v5, :cond_1e

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v5

    if-eqz v5, :cond_1e

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v8

    :cond_1e
    if-nez v8, :cond_1f

    goto :goto_a

    :cond_1f
    move-object v4, v8

    :goto_a
    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    new-instance v7, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_20
    sget-object v3, Lws2/h$i;->a:Lws2/h$i;

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lws2/g;->a()I

    move-result v5

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v4

    if-eqz v4, :cond_22

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomSheet()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    move-result-object v4

    if-eqz v4, :cond_22

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lsw0/h;->c(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lsw0/g;

    move-result-object v4

    if-nez v4, :cond_21

    goto :goto_c

    :cond_21
    move-object v6, v4

    goto :goto_d

    :cond_22
    :goto_c
    new-instance v5, Lsw0/g;

    const/16 v18, 0xfff

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v5 .. v19}, Lsw0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v5

    :goto_d
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v4, v1

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_23
    instance-of v3, v1, Lws2/e$a;

    if-eqz v3, :cond_27

    iget-object v3, v0, Lws2/c$b;->z:Lws2/c;

    invoke-static {v3}, Lws2/c;->g(Lws2/c;)Lws2/f;

    move-result-object v3

    invoke-virtual {v2}, Lws2/d;->d()Lws2/g;

    move-result-object v5

    check-cast v1, Lws2/e$a;

    invoke-virtual {v1}, Lws2/e$a;->a()I

    move-result v1

    invoke-virtual {v3, v5, v1}, Lws2/f;->a(Lws2/g;I)Lws2/g;

    move-result-object v1

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lws2/g;->a()I

    move-result v5

    invoke-static {v5, v3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-eqz v3, :cond_24

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_24

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_24

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_24

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_24
    move-object v9, v4

    sget-object v3, Lws2/h$i;->a:Lws2/h$i;

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lws2/g;->a()I

    move-result v5

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v4

    if-eqz v4, :cond_26

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomSheet()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    move-result-object v6

    if-eqz v6, :cond_26

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lsw0/h;->c(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lsw0/g;

    move-result-object v4

    if-nez v4, :cond_25

    goto :goto_f

    :cond_25
    move-object v6, v4

    goto :goto_10

    :cond_26
    :goto_f
    new-instance v5, Lsw0/g;

    const/16 v18, 0xfff

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v5 .. v19}, Lsw0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v5

    :goto_10
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v4, v1

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_27
    instance-of v3, v1, Lws2/e$f;

    if-eqz v3, :cond_36

    invoke-virtual {v2}, Lws2/d;->d()Lws2/g;

    move-result-object v1

    invoke-virtual {v1}, Lws2/g;->a()I

    move-result v1

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_28

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v3

    goto :goto_11

    :cond_28
    move-object v3, v8

    :goto_11
    if-nez v3, :cond_29

    move-object v3, v4

    :cond_29
    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v1

    if-eqz v1, :cond_2a

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v1

    goto :goto_12

    :cond_2a
    move-object v1, v8

    :goto_12
    if-nez v1, :cond_2b

    goto :goto_13

    :cond_2b
    move-object v4, v1

    :goto_13
    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    new-instance v6, Ll83/k;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v6, v7, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_2c
    invoke-virtual {v2}, Lws2/d;->c()Lsw0/g;

    move-result-object v1

    invoke-virtual {v1}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v15, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_34

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v16, v4

    check-cast v16, Lsw0/i;

    invoke-virtual/range {v16 .. v16}, Lsw0/i;->d()I

    move-result v18

    invoke-virtual/range {v16 .. v16}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_33

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v31, v7

    check-cast v31, Lsw0/j;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2e

    :cond_2d
    move/from16 v34, v5

    goto :goto_17

    :cond_2e
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll83/k;

    iget-object v9, v9, Ll83/k;->w:Ljava/lang/Object;

    invoke-virtual/range {v31 .. v31}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2f

    const/16 v34, 0x1

    :goto_17
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_30
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_31

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ll83/k;

    iget-object v10, v10, Ll83/k;->w:Ljava/lang/Object;

    invoke-virtual/range {v31 .. v31}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_30

    goto :goto_18

    :cond_31
    move-object v9, v8

    :goto_18
    check-cast v9, Ll83/k;

    if-eqz v9, :cond_32

    iget-object v7, v9, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    move-object/from16 v36, v7

    goto :goto_19

    :cond_32
    move-object/from16 v36, v8

    :goto_19
    const v48, 0xffeb

    const/16 v49, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-static/range {v31 .. v49}, Lsw0/j;->f(Lsw0/j;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lsw0/a;ZLcom/whoop/design/models/items/GoalSettingsTileTagModel;ZILjava/lang/Object;)Lsw0/j;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_16

    :cond_33
    const/16 v21, 0x9

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    move-object/from16 v19, v6

    invoke-static/range {v16 .. v22}, Lsw0/i;->b(Lsw0/i;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/i;

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_15

    :cond_34
    invoke-virtual {v2}, Lws2/d;->c()Lsw0/g;

    move-result-object v9

    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_35

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_35
    const/16 v22, 0xf5f

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v9 .. v23}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_36
    instance-of v3, v1, Lws2/e$b;

    if-eqz v3, :cond_39

    invoke-virtual {v2}, Lws2/d;->d()Lws2/g;

    move-result-object v3

    invoke-virtual {v3}, Lws2/g;->a()I

    move-result v3

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_38

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomSheet()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    move-result-object v3

    if-eqz v3, :cond_38

    invoke-virtual {v3}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getCategories()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_38

    check-cast v1, Lws2/e$b;

    invoke-virtual {v1}, Lws2/e$b;->a()I

    move-result v1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_37

    goto :goto_1c

    :cond_37
    :goto_1b
    move-object v8, v1

    goto :goto_1d

    :cond_38
    :goto_1c
    const-string v1, ""

    goto :goto_1b

    :goto_1d
    invoke-virtual {v2}, Lws2/d;->c()Lsw0/g;

    move-result-object v3

    const/16 v16, 0xfef

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v3 .. v17}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_39
    instance-of v3, v1, Lws2/e$p;

    if-eqz v3, :cond_3a

    invoke-virtual {v2}, Lws2/d;->c()Lsw0/g;

    move-result-object v9

    check-cast v1, Lws2/e$p;

    invoke-virtual {v1}, Lws2/e$p;->a()Ljava/lang/String;

    move-result-object v11

    const/16 v22, 0xffd

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_3a
    instance-of v3, v1, Lws2/e$n;

    if-eqz v3, :cond_3f

    invoke-virtual {v2}, Lws2/d;->c()Lsw0/g;

    move-result-object v3

    invoke-virtual {v3}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v16, v5

    check-cast v16, Lsw0/i;

    invoke-virtual/range {v16 .. v16}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v31, v5

    check-cast v31, Lsw0/j;

    invoke-virtual/range {v31 .. v31}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v5

    move-object v7, v1

    check-cast v7, Lws2/e$n;

    invoke-virtual {v7}, Lws2/e$n;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3c

    invoke-virtual/range {v31 .. v31}, Lsw0/j;->v()Z

    move-result v5

    xor-int/lit8 v34, v5, 0x1

    if-nez v5, :cond_3b

    new-instance v5, Ljava/lang/Integer;

    const/4 v7, 0x1

    invoke-direct {v5, v7}, Ljava/lang/Integer;-><init>(I)V

    move-object/from16 v36, v5

    goto :goto_20

    :cond_3b
    move-object/from16 v36, v8

    :goto_20
    const v48, 0xffeb

    const/16 v49, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-static/range {v31 .. v49}, Lsw0/j;->f(Lsw0/j;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lsw0/a;ZLcom/whoop/design/models/items/GoalSettingsTileTagModel;ZILjava/lang/Object;)Lsw0/j;

    move-result-object v31

    :cond_3c
    move-object/from16 v5, v31

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_3d
    const/16 v21, 0xb

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v19, v6

    invoke-static/range {v16 .. v22}, Lsw0/i;->b(Lsw0/i;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/i;

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0xa

    goto/16 :goto_1e

    :cond_3e
    invoke-virtual {v2}, Lws2/d;->c()Lsw0/g;

    move-result-object v9

    const/16 v22, 0xfdf

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_3f
    instance-of v1, v1, Lws2/e$i;

    if-eqz v1, :cond_60

    invoke-virtual {v2}, Lws2/d;->d()Lws2/g;

    move-result-object v1

    invoke-virtual {v1}, Lws2/g;->a()I

    move-result v1

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_40

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v3

    goto :goto_21

    :cond_40
    move-object v3, v8

    :goto_21
    if-nez v3, :cond_41

    move-object v3, v4

    :cond_41
    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v6

    if-eqz v6, :cond_42

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggleIds()Ljava/util/List;

    move-result-object v6

    goto :goto_22

    :cond_42
    move-object v6, v8

    :goto_22
    if-nez v6, :cond_43

    goto :goto_23

    :cond_43
    move-object v4, v6

    :goto_23
    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_44

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_24
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_44

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v6}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_24

    :cond_44
    check-cast v4, Ljava/util/Collection;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lws2/d;->c()Lsw0/g;

    move-result-object v6

    invoke-virtual {v6}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_45
    :goto_25
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lsw0/i;

    invoke-virtual {v7}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_46
    :goto_26
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_47

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lsw0/j;

    invoke-virtual {v12}, Lsw0/j;->v()Z

    move-result v12

    if-eqz v12, :cond_46

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_47
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v7}, Lsw0/i;->d()I

    move-result v9

    if-nez v9, :cond_45

    invoke-virtual {v7}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_48
    :goto_27
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_49

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lsw0/j;

    invoke-virtual {v11}, Lsw0/j;->v()Z

    move-result v12

    if-eqz v12, :cond_48

    invoke-virtual {v11}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_48

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_49
    new-instance v7, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v9, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_28
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4a

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lsw0/j;

    invoke-virtual {v10}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_28

    :cond_4a
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_25

    :cond_4b
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_29
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lsw0/j;

    invoke-static {v7}, Lsw0/h;->e(Lsw0/j;)Lcom/whoop/design/models/items/GoalSettingsTileModel;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_29

    :cond_4c
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v6

    if-eqz v6, :cond_51

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_51

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v5

    move-object v9, v8

    :cond_4d
    :goto_2b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v12}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v15}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4d

    if-eqz v7, :cond_4e

    :goto_2c
    move-object v9, v8

    goto :goto_2d

    :cond_4e
    move-object v9, v10

    const/4 v7, 0x1

    goto :goto_2b

    :cond_4f
    if-nez v7, :cond_50

    goto :goto_2c

    :cond_50
    :goto_2d
    check-cast v9, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    if-eqz v9, :cond_51

    invoke-virtual {v9}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked()Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v6, :cond_51

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_2e

    :cond_51
    move v6, v5

    :goto_2e
    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v7

    if-eqz v7, :cond_57

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_57

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v9, v5

    move-object v10, v8

    :goto_2f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_54

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v13}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v15}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_53

    if-eqz v9, :cond_52

    :goto_30
    move-object v10, v8

    goto :goto_31

    :cond_52
    move-object v10, v12

    const/4 v5, 0x0

    const/4 v9, 0x1

    goto :goto_2f

    :cond_53
    const/4 v5, 0x0

    goto :goto_2f

    :cond_54
    if-nez v9, :cond_55

    goto :goto_30

    :cond_55
    :goto_31
    check-cast v10, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    if-eqz v10, :cond_57

    invoke-virtual {v10}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_56

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move v6, v5

    goto :goto_32

    :cond_56
    const/4 v6, 0x0

    :cond_57
    :goto_32
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v23

    const/16 v27, 0x77f

    const/16 v28, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v15 .. v28}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->copy$default(Lcom/whoop/design/models/items/GoalSettingsTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;ILjava/lang/Object;)Lcom/whoop/design/models/items/GoalSettingsTileModel;

    move-result-object v5

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_58

    goto :goto_33

    :cond_58
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_59
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v15}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_59

    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_34

    :cond_5a
    :goto_33
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_34
    const/4 v5, 0x0

    goto/16 :goto_2a

    :cond_5b
    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v4

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, 0x0

    :goto_35
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v20, v7, 0x1

    if-ltz v7, :cond_5e

    move-object/from16 v21, v9

    check-cast v21, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-ne v7, v1, :cond_5d

    invoke-virtual {v2}, Lws2/d;->e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->getScreens()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v9

    if-eqz v9, :cond_5c

    const/16 v18, 0x6d

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v3

    invoke-static/range {v9 .. v19}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    move-object/from16 v24, v3

    goto :goto_36

    :cond_5c
    move-object/from16 v17, v3

    move-object/from16 v24, v8

    :goto_36
    const/16 v34, 0xffb

    const/16 v35, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v21 .. v35}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    move-result-object v21

    :goto_37
    move-object/from16 v3, v21

    goto :goto_38

    :cond_5d
    move-object/from16 v17, v3

    goto :goto_37

    :goto_38
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v17

    move/from16 v7, v20

    goto :goto_35

    :cond_5e
    invoke-static {}, Lwb3/f;->d0()V

    throw v8

    :cond_5f
    const/4 v7, 0x1

    invoke-static {v4, v8, v6, v7, v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Ljava/util/UUID;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object v5

    const/16 v7, 0xb

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lws2/d;->b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;

    move-result-object v1

    return-object v1

    :cond_60
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_61
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
