.class public final Lrq1/c$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq1/c$d;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
        "Lec3/m;"
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
.field final synthetic w:Lec3/m;

.field final synthetic x:Lrq1/c;


# direct methods
.method public constructor <init>(Lec3/m;Lrq1/c;)V
    .locals 0

    iput-object p1, p0, Lrq1/c$d$a;->w:Lec3/m;

    iput-object p2, p0, Lrq1/c$d$a;->x:Lrq1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lrq1/c$d$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lrq1/c$d$a$a;

    iget v3, v2, Lrq1/c$d$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lrq1/c$d$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lrq1/c$d$a$a;

    invoke-direct {v2, v0, v1}, Lrq1/c$d$a$a;-><init>(Lrq1/c$d$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lrq1/c$d$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lrq1/c$d$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lrq1/c$d$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lrq1/c$d$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lrq1/c$d$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lrq1/c$d$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$e;

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v6, :cond_3

    sget-object v4, Lrq1/b$b;->a:Lrq1/b$b;

    goto/16 :goto_5

    :cond_3
    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_5

    new-instance v9, Lrq1/b$c;

    new-instance v10, Lrq1/d;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->getLastRefreshTextDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v11}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v12}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-direct {v10, v6, v11, v12}, Lrq1/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getTiles()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getJournalEnabled()Z

    move-result v12

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getCycleId()Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v4}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getMetadata()Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/whoop/impacts/impacts/domain/requests/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v4

    move-object v14, v4

    goto :goto_1

    :cond_4
    move-object v14, v8

    :goto_1
    invoke-direct/range {v9 .. v14}, Lrq1/b$c;-><init>(Lrq1/d;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    :goto_2
    move-object v4, v9

    goto/16 :goto_5

    :cond_5
    instance-of v6, v4, Lpm0/a$a$b;

    if-eqz v6, :cond_7

    new-instance v9, Lrq1/b$c;

    new-instance v10, Lrq1/d;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->getLastRefreshTextDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v11}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v12}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-direct {v10, v6, v11, v12}, Lrq1/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getTiles()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getJournalEnabled()Z

    move-result v12

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getCycleId()Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v4}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getMetadata()Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/whoop/impacts/impacts/domain/requests/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v4

    move-object v14, v4

    goto :goto_3

    :cond_6
    move-object v14, v8

    :goto_3
    invoke-direct/range {v9 .. v14}, Lrq1/b$c;-><init>(Lrq1/d;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    goto :goto_2

    :cond_7
    instance-of v6, v4, Lpm0/a$d;

    const-string v9, "Fetching behavior impact failed "

    if-eqz v6, :cond_9

    iget-object v6, v0, Lrq1/c$d$a;->x:Lrq1/c;

    invoke-static {v6}, Lrq1/c;->d(Lrq1/c;)Ltr2/n;

    move-result-object v6

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-array v10, v7, [Lqr2/a$a;

    invoke-interface {v6, v9, v10}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v11, Lrq1/b$c;

    new-instance v12, Lrq1/d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->getLastRefreshTextDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v9}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v10}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-direct {v12, v6, v9, v10}, Lrq1/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getTiles()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getJournalEnabled()Z

    move-result v14

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getCycleId()Ljava/lang/Long;

    move-result-object v15

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    invoke-virtual {v4}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->getMetadata()Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/whoop/impacts/impacts/domain/requests/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v4

    move-object/from16 v16, v4

    goto :goto_4

    :cond_8
    move-object/from16 v16, v8

    :goto_4
    invoke-direct/range {v11 .. v16}, Lrq1/b$c;-><init>(Lrq1/d;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    move-object v4, v11

    goto :goto_5

    :cond_9
    instance-of v6, v4, Lpm0/a$c;

    if-eqz v6, :cond_a

    iget-object v6, v0, Lrq1/c$d$a;->x:Lrq1/c;

    invoke-static {v6}, Lrq1/c;->d(Lrq1/c;)Ltr2/n;

    move-result-object v6

    check-cast v4, Lpm0/a$c;

    invoke-virtual {v4}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-array v11, v7, [Lqr2/a$a;

    invoke-interface {v6, v10, v11}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v6, Lrq1/b$a;

    invoke-virtual {v4}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Lrq1/b$a;-><init>(Ljava/lang/String;)V

    move-object v4, v6

    goto :goto_5

    :cond_a
    iget-object v4, v0, Lrq1/c$d$a;->x:Lrq1/c;

    invoke-static {v4}, Lrq1/c;->d(Lrq1/c;)Ltr2/n;

    move-result-object v4

    new-array v6, v7, [Lqr2/a$a;

    const-string v9, "Fetching behavior impact failed with unknown error"

    invoke-interface {v4, v9, v6}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lrq1/b$a;

    invoke-direct {v4, v9}, Lrq1/b$a;-><init>(Ljava/lang/String;)V

    :goto_5
    iput-object v8, v2, Lrq1/c$d$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lrq1/c$d$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lrq1/c$d$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lrq1/c$d$a$a;->G:Ljava/lang/Object;

    iput v7, v2, Lrq1/c$d$a$a;->H:I

    iput v5, v2, Lrq1/c$d$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    return-object v3

    :cond_b
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
