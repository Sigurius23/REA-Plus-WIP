.class public abstract Ley2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;",
        "Lfy2/b$b;",
        "b",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;)Lfy2/b$b;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;",
        "Lfy2/c;",
        "c",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;)Lfy2/c;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;",
        "Lfy2/d;",
        "d",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;)Lfy2/d;",
        "whooplabs_release"
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
.method public static final synthetic a(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;)Lfy2/b$b;
    .locals 0

    invoke-static {p0}, Ley2/b;->b(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;)Lfy2/b$b;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;)Lfy2/b$b;
    .locals 6

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;->getCampaignId()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;->getPageTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;->getSections()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;

    invoke-static {v0}, Ley2/b;->c(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;)Lfy2/c;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lfy2/b$b;

    invoke-direct/range {v0 .. v5}, Lfy2/b$b;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public static final c(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;)Lfy2/c;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;->getCampaignScheduleTasks()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;

    invoke-static {v3}, Ley2/b;->d(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;)Lfy2/d;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p0, Lfy2/c;

    invoke-direct {p0, v0, v1, v2}, Lfy2/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method public static final d(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;)Lfy2/d;
    .locals 28

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;->getSessionId()I

    move-result v0

    sget-object v1, Ly71/o;->p:Ly71/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v3, Ley2/b$a;->w:Ley2/b$a;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;->getLeftIcon()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    sget-object v8, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v9

    array-length v10, v9

    move v11, v4

    :goto_0
    if-ge v11, v10, :cond_1

    aget-object v12, v9, v11

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_1
    move-object v12, v7

    :goto_1
    if-nez v12, :cond_2

    goto :goto_2

    :cond_2
    move-object v8, v12

    :goto_2
    invoke-virtual {v8}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v9, Ly71/g;

    invoke-direct {v9, v3, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    goto :goto_3

    :cond_3
    move-object v9, v7

    :goto_3
    sget-object v3, Ley2/b$b;->w:Ley2/b$b;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;->getRightIcon()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    sget-object v10, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v11

    array-length v12, v11

    :goto_4
    if-ge v4, v12, :cond_5

    aget-object v13, v11, v4

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    move-object v7, v13

    goto :goto_5

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    if-nez v7, :cond_6

    goto :goto_6

    :cond_6
    move-object v10, v7

    :goto_6
    invoke-virtual {v10}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v7, Ly71/g;

    invoke-direct {v7, v3, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    :cond_7
    sget-object v3, Ley2/b$c;->w:Ley2/b$c;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v10

    sget-object v3, Ley2/b$d;->w:Ley2/b$d;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;->getMenuItemState()Ljava/lang/String;

    move-result-object v3

    const-string v4, "ENABLED"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    const v25, 0x7f9e06

    const/16 v26, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v27, v9

    move-object v9, v7

    move-object/from16 v7, v27

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v1

    new-instance v2, Lfy2/d;

    invoke-direct {v2, v0, v1}, Lfy2/d;-><init>(ILy71/o;)V

    return-object v2
.end method
