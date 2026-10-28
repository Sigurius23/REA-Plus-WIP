.class public abstract Ldd1/b;
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
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ALTERNATIVE_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    const-string v1, "Alternative"

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v1, v0, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CARD_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    const-string v4, "Card"

    invoke-static {v4, v1, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v4, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CARD_ICON_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v4}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v4

    sget-object v5, Ldd1/f;->a:Ldd1/f;

    invoke-virtual {v5}, Ldd1/f;->c()Lc93/m;

    move-result-object v6

    const-string v7, "Card Icon"

    invoke-static {v7, v4, v6}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v4

    sget-object v6, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_BUTTON_ICON:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    invoke-static {v6}, Ldd1/r;->d(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;

    move-result-object v6

    const-string v7, "Icon"

    invoke-static {v7, v6, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v6

    sget-object v7, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ICON_TOGGLE_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v7}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v7

    const-string v8, "Icon Toggle"

    invoke-static {v8, v7, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v7

    sget-object v8, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MULTIPLE_BUTTON_CONTAINER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v8}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v8

    invoke-virtual {v5}, Ldd1/f;->d()Lc93/m;

    move-result-object v5

    const-string v9, "Multiple Button Container"

    invoke-static {v9, v8, v5}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v5

    sget-object v8, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PRIMARY_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v8}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v8

    const-string v9, "Primary"

    invoke-static {v9, v8, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v8

    sget-object v9, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->RADIO_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v9}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v9

    const-string v10, "Radio"

    invoke-static {v10, v9, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v9

    sget-object v10, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SECONDARY_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v10}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v10

    const-string v11, "Secondary"

    invoke-static {v11, v10, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v10

    sget-object v11, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SHARE_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v11}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v11

    const-string v12, "Share"

    invoke-static {v12, v11, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v11

    sget-object v12, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->STATE_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v12}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v12

    const-string v13, "State"

    invoke-static {v13, v12, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v12

    sget-object v13, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TOGGLE_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v13}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v13

    const-string v14, "Toggle"

    invoke-static {v14, v13, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v2

    const/16 v13, 0xc

    new-array v13, v13, [Lm91/u;

    const/4 v14, 0x0

    aput-object v0, v13, v14

    const/4 v0, 0x1

    aput-object v1, v13, v0

    const/4 v0, 0x2

    aput-object v4, v13, v0

    const/4 v0, 0x3

    aput-object v6, v13, v0

    aput-object v7, v13, v3

    const/4 v0, 0x5

    aput-object v5, v13, v0

    const/4 v0, 0x6

    aput-object v8, v13, v0

    const/4 v0, 0x7

    aput-object v9, v13, v0

    const/16 v0, 0x8

    aput-object v10, v13, v0

    const/16 v0, 0x9

    aput-object v11, v13, v0

    const/16 v0, 0xa

    aput-object v12, v13, v0

    const/16 v0, 0xb

    aput-object v2, v13, v0

    invoke-static {v13}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v0

    invoke-interface {v0}, Ln91/a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
