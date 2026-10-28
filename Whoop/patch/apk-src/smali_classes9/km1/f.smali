.class public abstract Lkm1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/ChallengeHomeTileModel;",
        "Lkm1/e;",
        "a",
        "(Lcom/whoop/home/domain/models/ChallengeHomeTileModel;)Lkm1/e;",
        "home_release"
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
.method public static final a(Lcom/whoop/home/domain/models/ChallengeHomeTileModel;)Lkm1/e;
    .locals 19

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;->getCtaButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v2}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v0

    move-object v11, v0

    goto :goto_1

    :cond_1
    move-object v11, v2

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;->getProgressBar()Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;

    move-result-object v0

    const-string v3, ""

    if-eqz v0, :cond_5

    new-instance v4, Lkm1/c;

    invoke-virtual {v0}, Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    move-object v5, v3

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;->getTotalValue()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    move-object v6, v3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;->getLabel()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    move-object v7, v3

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;->getPercentValue()I

    move-result v8

    invoke-virtual {v0}, Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;->getProgressBarStyle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkm1/d;->a(Ljava/lang/String;)Li2/t;

    move-result-object v9

    invoke-direct/range {v4 .. v9}, Lkm1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILi2/t;)V

    move-object v10, v4

    goto :goto_2

    :cond_5
    move-object v10, v2

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;->getHeaderTitle()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    move-object v4, v3

    goto :goto_3

    :cond_6
    move-object v4, v0

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;->getSubtitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;->getImageUrl()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_7

    new-instance v12, Lkd1/o$c;

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v12

    goto :goto_4

    :cond_7
    move-object v7, v2

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;->getDaysLeftDisplay()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/ChallengeHomeTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_8

    new-instance v12, Lcom/whoop/navigation/e;

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_8
    move-object v12, v0

    :goto_5
    new-instance v3, Lkm1/e;

    invoke-direct/range {v3 .. v12}, Lkm1/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lkm1/c;Lny0/h;Lcom/whoop/navigation/e;)V

    return-object v3
.end method
