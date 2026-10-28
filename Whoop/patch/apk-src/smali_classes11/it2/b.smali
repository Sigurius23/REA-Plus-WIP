.class public abstract Lit2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000c\u001a\u0004\u0018\u00010\u0008*\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroid/os/Bundle;",
        "Lit2/a;",
        "b",
        "(Landroid/os/Bundle;)Lit2/a;",
        "Lcom/whoop/navigation/InitialSelectionModel;",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;",
        "e",
        "(Lcom/whoop/navigation/InitialSelectionModel;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;",
        "",
        "initialSelectionJson",
        "c",
        "(Ljava/lang/String;)Lcom/whoop/navigation/InitialSelectionModel;",
        "f",
        "(Ljava/lang/String;)Ljava/lang/String;",
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
.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lit2/b;->d(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/os/Bundle;)Lit2/a;
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "initialSelection"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_1

    const-string v3, "source"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v11, v3

    goto :goto_1

    :cond_1
    move-object v11, v1

    :goto_1
    if-eqz v0, :cond_2

    const-string v3, "presetPlanCategory"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v12, v3

    goto :goto_2

    :cond_2
    move-object v12, v1

    :goto_2
    if-eqz v0, :cond_3

    const-string v3, "planTitle"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_3
    move-object v3, v1

    :goto_3
    invoke-static {v3}, Lit2/b;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v0, :cond_4

    const-string v3, "description"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_4
    move-object v3, v1

    :goto_4
    invoke-static {v3}, Lit2/b;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-eqz v0, :cond_5

    const-string v3, "explanationTitle"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_5
    move-object v3, v1

    :goto_5
    invoke-static {v3}, Lit2/b;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-eqz v0, :cond_6

    const-string v3, "explanation"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_6
    move-object v3, v1

    :goto_6
    invoke-static {v3}, Lit2/b;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    if-eqz v0, :cond_7

    const-string v3, "templateId"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v17, v3

    goto :goto_7

    :cond_7
    move-object/from16 v17, v1

    :goto_7
    if-eqz v0, :cond_8

    const-string v3, "category"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v18, v3

    goto :goto_8

    :cond_8
    move-object/from16 v18, v1

    :goto_8
    if-eqz v0, :cond_9

    const-string v3, "carouselPlacement"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v19, v3

    goto :goto_9

    :cond_9
    move-object/from16 v19, v1

    :goto_9
    if-eqz v0, :cond_a

    const-string v3, "dismissalType"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_a

    :cond_a
    move-object v3, v1

    :goto_a
    invoke-static {v3}, Lj02/t;->a(Ljava/lang/String;)Lj02/v;

    move-result-object v20

    new-instance v4, Lit2/a;

    if-eqz v0, :cond_b

    const-string v3, "planName"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_b

    :cond_b
    move-object v3, v1

    :goto_b
    const-string v5, ""

    if-nez v3, :cond_c

    move-object v3, v5

    :cond_c
    const/4 v6, 0x0

    if-eqz v0, :cond_d

    const-string v7, "locked"

    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v7

    goto :goto_c

    :cond_d
    move v7, v6

    :goto_c
    if-eqz v0, :cond_e

    const-string v6, "noPlanShowMetricSelection"

    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    :cond_e
    if-eqz v0, :cond_f

    const-string v8, "analyticsSource"

    invoke-virtual {v0, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_d

    :cond_f
    move-object v8, v1

    :goto_d
    if-nez v8, :cond_10

    move-object v8, v5

    :cond_10
    invoke-static {v2}, Lit2/b;->c(Ljava/lang/String;)Lcom/whoop/navigation/InitialSelectionModel;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-static {v2}, Lit2/b;->e(Lcom/whoop/navigation/InitialSelectionModel;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;

    move-result-object v2

    move-object v9, v2

    goto :goto_e

    :cond_11
    move-object v9, v1

    :goto_e
    if-eqz v0, :cond_12

    const-string v1, "date"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_12
    move v5, v7

    move v7, v6

    move v6, v5

    move-object v10, v1

    move-object v5, v3

    invoke-direct/range {v4 .. v20}, Lit2/a;-><init>(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/v;)V

    return-object v4
.end method

.method public static final c(Ljava/lang/String;)Lcom/whoop/navigation/InitialSelectionModel;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lio2/e;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lio2/e;-><init>(I)V

    sget-object v2, Lad3/c;->d:Lad3/b;

    invoke-static {v2, v1}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v1

    :try_start_0
    sget-object v2, Lcom/whoop/navigation/InitialSelectionModel;->Companion:Lcom/whoop/navigation/InitialSelectionModel$a;

    invoke-virtual {v2}, Lcom/whoop/navigation/InitialSelectionModel$a;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v1, v2, p0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/InitialSelectionModel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    :try_start_1
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    move-result-object p0

    const-string v2, "decode(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, p0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sget-object p0, Lcom/whoop/navigation/InitialSelectionModel;->Companion:Lcom/whoop/navigation/InitialSelectionModel$a;

    invoke-virtual {p0}, Lcom/whoop/navigation/InitialSelectionModel$a;->serializer()Lwc3/c;

    move-result-object p0

    check-cast p0, Lwc3/b;

    invoke-virtual {v1, p0, v2}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/navigation/InitialSelectionModel;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, p0

    :catch_1
    :cond_1
    :goto_0
    return-object v0
.end method

.method private static final d(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->c:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Lcom/whoop/navigation/InitialSelectionModel;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/navigation/InitialSelectionModel;->getTargetGoals()Ljava/util/List;

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

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/navigation/TargetGoalModel;

    new-instance v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;

    invoke-virtual {v3}, Lcom/whoop/navigation/TargetGoalModel;->getGoalTypeId()I

    move-result v5

    invoke-virtual {v3}, Lcom/whoop/navigation/TargetGoalModel;->getTarget()D

    move-result-wide v6

    invoke-virtual {v3}, Lcom/whoop/navigation/TargetGoalModel;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v6, v7, v3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;-><init>(IDLjava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/navigation/InitialSelectionModel;->getActivityGoals()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/navigation/ActivityGoalModel;

    new-instance v5, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;

    invoke-virtual {v4}, Lcom/whoop/navigation/ActivityGoalModel;->getActivityType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/navigation/ActivityGoalModel;->getDays()I

    move-result v4

    invoke-direct {v5, v6, v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;-><init>(Ljava/lang/String;I)V

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/navigation/InitialSelectionModel;->getBehaviorGoals()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/BehaviorGoalModel;

    new-instance v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;

    invoke-virtual {v2}, Lcom/whoop/navigation/BehaviorGoalModel;->getBehaviorTrackerId()I

    move-result v5

    invoke-virtual {v2}, Lcom/whoop/navigation/BehaviorGoalModel;->getDays()I

    move-result v6

    invoke-virtual {v2}, Lcom/whoop/navigation/BehaviorGoalModel;->getAvoid()Z

    move-result v2

    invoke-direct {v4, v5, v6, v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;-><init>(IIZ)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;

    invoke-direct {p0, v1, v3, v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method private static final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v0, "%"

    const-string v1, "%25"

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    const-string v1, "++"

    const-string v3, "%20%2B"

    invoke-static {v0, v1, v3, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-object p0
.end method
