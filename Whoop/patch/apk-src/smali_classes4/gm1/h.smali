.class public abstract Lgm1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;",
        "Lwm1/l;",
        "b",
        "(Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;)Lwm1/l;",
        "Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;",
        "Lwm1/c;",
        "a",
        "(Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;)Lwm1/c;",
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
.method public static final a(Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;)Lwm1/c;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getScoreDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getScoreDisplaySuffix()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getGaugeFillPercentage()F

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getProgressFillStyle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/u1;->t(Ljava/lang/String;)Li91/a;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getTitleEndIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getLowerOptimalPercentage()Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getHigherOptimalPercentage()Ljava/lang/Float;

    move-result-object v11

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getScoreTarget()Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v12

    new-instance v1, Lwm1/c;

    invoke-direct/range {v1 .. v12}, Lwm1/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public static final b(Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;)Lwm1/l;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;->getGauges()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;

    invoke-static {v3}, Lgm1/h;->a(Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;)Lwm1/c;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;->getHeaderItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {}, Lgm1/c;->C()Ljb1/a;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_1

    :cond_1
    sget-object p0, Lm83/y;->w:Lm83/y;

    :goto_1
    new-instance v1, Lwm1/l;

    invoke-direct {v1, v0, v2, p0}, Lwm1/l;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method
