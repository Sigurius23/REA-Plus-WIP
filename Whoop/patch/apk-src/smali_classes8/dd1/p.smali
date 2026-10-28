.class public abstract Ldd1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "Lm91/u;",
        "a",
        "()Ljava/util/List;",
        "design-showcase_release"
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
.method public static final a()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HORIZONTAL_BAR_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    sget-object v1, Ldd1/g;->a:Ldd1/g;

    invoke-virtual {v1}, Ldd1/g;->j()Lc93/m;

    move-result-object v2

    const-string v3, "Horizontal Bar Graph"

    invoke-static {v3, v0, v2}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HORIZONTAL_BAR_GRAPH_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v1}, Ldd1/g;->h()Lc93/m;

    move-result-object v3

    const-string v4, "Horizontal Bar Graph Tile"

    invoke-static {v4, v2, v3}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v2

    sget-object v3, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HORIZONTAL_IMPACT_BAR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v3}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v3

    invoke-virtual {v1}, Ldd1/g;->k()Lc93/m;

    move-result-object v4

    const-string v5, "Horizontal Impact Bar"

    invoke-static {v5, v3, v4}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v3

    sget-object v4, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HORIZONTAL_IMPACT_BAR_LABELED:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v4}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v4

    invoke-virtual {v1}, Ldd1/g;->i()Lc93/m;

    move-result-object v5

    const-string v6, "Horizontal Impact Bar Labeled"

    invoke-static {v6, v4, v5}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v4

    sget-object v5, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HORIZONTAL_TIME_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v5}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v5

    invoke-virtual {v1}, Ldd1/g;->g()Lc93/m;

    move-result-object v6

    const-string v7, "Horizontal Time Graph"

    invoke-static {v7, v5, v6}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v5

    sget-object v6, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ICON_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v6}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v6

    invoke-virtual {v1}, Ldd1/g;->l()Lc93/m;

    move-result-object v1

    const-string v7, "Icon Graph"

    invoke-static {v7, v6, v1}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v1

    const/4 v6, 0x6

    new-array v6, v6, [Lm91/u;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v2, v6, v0

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v4, v6, v0

    const/4 v0, 0x4

    aput-object v5, v6, v0

    const/4 v0, 0x5

    aput-object v1, v6, v0

    invoke-static {v6}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v0

    invoke-interface {v0}, Ln91/a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
