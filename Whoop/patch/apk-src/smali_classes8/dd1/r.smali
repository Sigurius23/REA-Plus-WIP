.class public abstract Ldd1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "",
        "text",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;",
        "navigationEvent",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "preview",
        "Led1/b;",
        "a",
        "(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
        "menuType",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;",
        "f",
        "(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;",
        "galleryType",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;",
        "d",
        "(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;",
        "e",
        "()Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;",
        "atomicType",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;",
        "c",
        "(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;",
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
.method public static final a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;",
            "Lc93/m;",
            ")",
            "Led1/b;"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Led1/b;

    const/16 v8, 0x14

    const/4 v9, 0x0

    const/4 v4, 0x0

    const-string v5, ""

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v9}, Led1/b;-><init>(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Ljava/lang/String;Ljava/lang/String;ZLc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const-string p0, ""

    :cond_0
    and-int/lit8 p4, p3, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    new-instance p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;

    const/4 p4, 0x1

    invoke-direct {p1, v0, p4, v0}, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;-><init>(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    move-object p2, v0

    :cond_2
    invoke-static {p0, p1, p2}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;
    .locals 1

    const-string v0, "atomicType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    invoke-direct {v0, p0}, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;-><init>(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)V

    return-object v0
.end method

.method public static final d(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;
    .locals 1

    const-string v0, "galleryType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;

    invoke-direct {v0, p0}, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;-><init>(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)V

    return-object v0
.end method

.method public static final e()Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;
    .locals 1

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;->a:Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;

    return-object v0
.end method

.method public static final f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;
    .locals 1

    const-string v0, "menuType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    invoke-direct {v0, p0}, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;-><init>(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)V

    return-object v0
.end method
