.class public abstract Ldd1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
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
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CALENDAR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    const-string v1, "Calendar"

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v1, v0, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PAGER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    const-string v4, "Pager"

    invoke-static {v4, v1, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lm91/u;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v0

    invoke-interface {v0}, Ln91/a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
