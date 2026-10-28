.class public abstract Lb60/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;",
        "Lc60/d;",
        "a",
        "(Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;)Lc60/d;",
        "access_release"
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
.method public static final a(Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;)Lc60/d;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;->getSubtitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;->getStats()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/access/programgoaltile/models/ProgramGoalStatModel;

    new-instance v5, Lc60/a;

    invoke-virtual {v4}, Lcom/whoop/access/programgoaltile/models/ProgramGoalStatModel;->getLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/access/programgoaltile/models/ProgramGoalStatModel;->getValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcom/whoop/access/programgoaltile/models/ProgramGoalStatModel;->getUnit()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v6, v7, v4}, Lc60/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;->getCaptionDisplay()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Lc60/d;

    invoke-direct {v2, v0, v1, v3, p0}, Lc60/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v2
.end method
