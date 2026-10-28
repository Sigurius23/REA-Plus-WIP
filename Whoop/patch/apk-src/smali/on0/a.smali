.class public final Lon0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lon0/a;",
        "",
        "<init>",
        "()V",
        "Ljn0/b;",
        "domainResult",
        "Lmn0/c;",
        "a",
        "(Ljn0/b;)Lmn0/c;",
        "challenge-details_release"
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
.method public final a(Ljn0/b;)Lmn0/c;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "domainResult"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Ljn0/b$b;

    if-eqz v1, :cond_0

    new-instance v2, Lmn0/c;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lmn0/c;-><init>(ZZLnn0/a;Ljn0/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    instance-of v1, v0, Ljn0/b$a;

    if-eqz v1, :cond_1

    new-instance v2, Lmn0/c;

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lmn0/c;-><init>(ZZLnn0/a;Ljn0/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    instance-of v1, v0, Ljn0/b$c;

    if-eqz v1, :cond_9

    check-cast v0, Ljn0/b$c;

    invoke-virtual {v0}, Ljn0/b$c;->c()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getToolbarTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getHeaderImageUrl()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible()Z

    move-result v5

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getIneligibleText()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getChallengeTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getChallengeCardItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;

    invoke-virtual {v9}, Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;->getIcon()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lgz0/m0;->GOALS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v12

    array-length v13, v12

    const/4 v14, 0x0

    :goto_1
    const/16 v16, 0x0

    if-ge v14, v13, :cond_3

    aget-object v17, v12, v14

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_3
    move-object/from16 v17, v16

    :goto_2
    if-nez v17, :cond_4

    goto :goto_3

    :cond_4
    move-object/from16 v11, v17

    :goto_3
    invoke-virtual {v9}, Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;->getIconColor()Ljava/lang/String;

    move-result-object v10

    sget-object v12, Ly81/f;->BRAND_WHOOP_PRO:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v13

    array-length v14, v13

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v14, :cond_6

    aget-object v17, v13, v15

    move-object/from16 v18, v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v16, v17

    goto :goto_5

    :cond_5
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, v18

    goto :goto_4

    :cond_6
    move-object/from16 v18, v0

    :goto_5
    if-nez v16, :cond_7

    goto :goto_6

    :cond_7
    move-object/from16 v12, v16

    :goto_6
    invoke-virtual {v9}, Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v9}, Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;->getSubText()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v10, Lnn0/b;

    invoke-direct {v10, v11, v12, v0, v9}, Lnn0/b;-><init>(Lgz0/m0;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v18

    goto :goto_0

    :cond_8
    move-object/from16 v18, v0

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getDescriptionTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getDescriptionText()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getCtaText()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getStyle()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getSavingText()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->getSavingSubText()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v2, Lnn0/a;

    invoke-direct/range {v2 .. v14}, Lnn0/a;-><init>(Lcom/whoop/design/util/TextResource;Lkd1/o;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual/range {v18 .. v18}, Ljn0/b$c;->d()Ljn0/d;

    move-result-object v0

    new-instance v1, Lmn0/c;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v2, v0}, Lmn0/c;-><init>(ZZLnn0/a;Ljn0/d;)V

    return-object v1

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
