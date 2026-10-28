.class public abstract synthetic Landroid/support/v4/media/session/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a()Landroid/graphics/RenderNode;
    .locals 2

    new-instance v0, Landroid/graphics/RenderNode;

    const-string v1, "OffscreenLayer.main"

    invoke-direct {v0, v1}, Landroid/graphics/RenderNode;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/String;)Landroid/media/session/MediaSession;
    .locals 2

    new-instance v0, Landroid/media/session/MediaSession;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static synthetic c(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;
    .locals 1

    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0, p0}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    return-object v0
.end method

.method public static synthetic d()Landroid/graphics/RenderNode;
    .locals 2

    new-instance v0, Landroid/graphics/RenderNode;

    const-string v1, "OffscreenLayer.shadow"

    invoke-direct {v0, v1}, Landroid/graphics/RenderNode;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic e()Landroid/graphics/RenderNode;
    .locals 2

    new-instance v0, Landroid/graphics/RenderNode;

    const-string v1, "AndroidEdgeEffectOverscrollEffect"

    invoke-direct {v0, v1}, Landroid/graphics/RenderNode;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
