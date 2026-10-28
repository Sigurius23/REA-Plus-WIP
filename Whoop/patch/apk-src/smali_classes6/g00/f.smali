.class public final Lg00/f;
.super Lq/d;
.source "SourceFile"


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Z

.field public final synthetic i:Landroid/content/res/Configuration;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLandroid/content/res/Configuration;Landroid/content/res/Resources$Theme;)V
    .locals 0

    iput-object p1, p0, Lg00/f;->g:Landroid/content/Context;

    iput-boolean p2, p0, Lg00/f;->h:Z

    iput-object p3, p0, Lg00/f;->i:Landroid/content/res/Configuration;

    invoke-direct {p0, p1, p4}, Lq/d;-><init>(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V

    return-void
.end method


# virtual methods
.method public final getResources()Landroid/content/res/Resources;
    .locals 4

    iget-boolean v0, p0, Lg00/f;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg00/f;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v3, p0, Lg00/f;->i:Landroid/content/res/Configuration;

    invoke-direct {v1, v2, v0, v3}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    return-object v1

    :cond_0
    invoke-super {p0}, Lq/d;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method
