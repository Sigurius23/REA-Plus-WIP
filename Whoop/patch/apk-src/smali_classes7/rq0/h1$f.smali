.class final Lrq0/h1$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/h1;->n0(Lcom/whoop/domain/model/teams/Team;)Le50/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.presentation.teams.TeamsViewModel$loadTeam$1"
    f = "TeamsViewModel.kt"
    l = {
        0x4f,
        0x4f,
        0x5c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:I

.field H:I

.field final synthetic I:Lrq0/h1;

.field final synthetic J:Lcom/whoop/domain/model/teams/Team;

.field final synthetic K:Le50/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le50/c<",
            "Lcom/whoop/domain/model/teams/Team;",
            ">;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lrq0/h1;Lcom/whoop/domain/model/teams/Team;Le50/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/h1;",
            "Lcom/whoop/domain/model/teams/Team;",
            "Le50/c<",
            "Lcom/whoop/domain/model/teams/Team;",
            ">;",
            "Lq83/d<",
            "-",
            "Lrq0/h1$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/h1$f;->I:Lrq0/h1;

    iput-object p2, p0, Lrq0/h1$f;->J:Lcom/whoop/domain/model/teams/Team;

    iput-object p3, p0, Lrq0/h1$f;->K:Le50/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lrq0/h1$f;

    iget-object v0, p0, Lrq0/h1$f;->I:Lrq0/h1;

    iget-object v1, p0, Lrq0/h1$f;->J:Lcom/whoop/domain/model/teams/Team;

    iget-object v2, p0, Lrq0/h1$f;->K:Le50/c;

    invoke-direct {p1, v0, v1, v2, p2}, Lrq0/h1$f;-><init>(Lrq0/h1;Lcom/whoop/domain/model/teams/Team;Le50/c;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lrq0/h1$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/h1$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/h1$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/h1$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrq0/h1$f;->H:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lrq0/h1$f;->E:Ljava/lang/Object;

    check-cast v1, [Lcom/whoop/ui/ScoreContext;

    iget-object v1, v0, Lrq0/h1$f;->z:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/LocalDate;

    iget-object v1, v0, Lrq0/h1$f;->y:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/LocalDate;

    iget-object v1, v0, Lrq0/h1$f;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/teams/Team;

    iget-object v1, v0, Lrq0/h1$f;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/teams/Team;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_2
    iget v2, v0, Lrq0/h1$f;->F:I

    iget-object v5, v0, Lrq0/h1$f;->w:Ljava/lang/Object;

    check-cast v5, Lcq0/g;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v5

    move-object/from16 v5, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lrq0/h1$f;->I:Lrq0/h1;

    invoke-static {v2}, Lrq0/h1;->E(Lrq0/h1;)Lcq0/g;

    move-result-object v2

    iget-object v7, v0, Lrq0/h1$f;->J:Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {v7}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v7

    iget-object v8, v0, Lrq0/h1$f;->I:Lrq0/h1;

    iput-object v2, v0, Lrq0/h1$f;->w:Ljava/lang/Object;

    iput v7, v0, Lrq0/h1$f;->F:I

    iput v5, v0, Lrq0/h1$f;->H:I

    invoke-virtual {v8, v0}, Lrq0/h1;->F0(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    goto/16 :goto_3

    :cond_4
    move/from16 v26, v7

    move-object v7, v2

    move/from16 v2, v26

    :goto_0
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    iget-object v8, v0, Lrq0/h1$f;->J:Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/Team;->getTeamType()Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v8

    iput-object v6, v0, Lrq0/h1$f;->w:Ljava/lang/Object;

    iput v4, v0, Lrq0/h1$f;->H:I

    invoke-virtual {v7, v2, v5, v8, v0}, Lcq0/g;->w(IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    move-object v8, v2

    check-cast v8, Lcom/whoop/domain/model/teams/Team;

    if-eqz v8, :cond_7

    iget-object v2, v0, Lrq0/h1$f;->K:Le50/c;

    iget-object v4, v0, Lrq0/h1$f;->I:Lrq0/h1;

    invoke-virtual {v2, v8}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/Team;->getEnabledTabs()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    const/4 v5, 0x0

    new-array v7, v5, [Lcom/whoop/ui/ScoreContext;

    invoke-interface {v2, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/whoop/ui/ScoreContext;

    invoke-static {v4}, Lrq0/h1;->F(Lrq0/h1;)Lrq0/i1;

    move-result-object v7

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/Team;->getEnabledTabs()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/ui/ScoreContext;

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v9, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    const v24, 0xf7fe

    const/16 v25, 0x0

    move-object/from16 v19, v9

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v7 .. v25}, Lrq0/i1;->c(Lrq0/i1;Lcom/whoop/domain/model/teams/Team;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZZLcom/whoop/community/domain/model/teams/TimePeriod;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lrq0/i1;

    move-result-object v7

    invoke-static {v4, v7}, Lrq0/h1;->K(Lrq0/h1;Lrq0/i1;)V

    invoke-static {v4}, Lrq0/h1;->I(Lrq0/h1;)V

    sget-object v7, Lcom/whoop/community/domain/model/teams/TimePeriod;->DAILY:Lcom/whoop/community/domain/model/teams/TimePeriod;

    invoke-virtual {v4, v7}, Lrq0/h1;->v0(Lcom/whoop/community/domain/model/teams/TimePeriod;)V

    invoke-static {v4}, Lrq0/h1;->F(Lrq0/h1;)Lrq0/i1;

    move-result-object v7

    invoke-virtual {v7}, Lrq0/i1;->m()Lorg/joda/time/LocalDate;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-static {v4}, Lrq0/h1;->F(Lrq0/h1;)Lrq0/i1;

    move-result-object v9

    invoke-virtual {v9}, Lrq0/i1;->n()Lcom/whoop/community/domain/model/teams/TimePeriod;

    move-result-object v9

    array-length v10, v2

    invoke-static {v2, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Lcom/whoop/ui/ScoreContext;

    invoke-static {v4, v9, v10}, Lrq0/h1;->B(Lrq0/h1;Lcom/whoop/community/domain/model/teams/TimePeriod;[Lcom/whoop/ui/ScoreContext;)V

    array-length v9, v2

    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/whoop/ui/ScoreContext;

    iput-object v8, v0, Lrq0/h1$f;->w:Ljava/lang/Object;

    iput-object v6, v0, Lrq0/h1$f;->x:Ljava/lang/Object;

    iput-object v7, v0, Lrq0/h1$f;->y:Ljava/lang/Object;

    iput-object v6, v0, Lrq0/h1$f;->z:Ljava/lang/Object;

    iput-object v6, v0, Lrq0/h1$f;->E:Ljava/lang/Object;

    iput v5, v0, Lrq0/h1$f;->F:I

    iput v5, v0, Lrq0/h1$f;->G:I

    iput v3, v0, Lrq0/h1$f;->H:I

    invoke-static {v4, v2, v0}, Lrq0/h1;->H(Lrq0/h1;[Lcom/whoop/ui/ScoreContext;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
