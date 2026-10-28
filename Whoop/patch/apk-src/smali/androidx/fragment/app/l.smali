.class public abstract Landroidx/fragment/app/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/fragment/app/p2;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/p2;)V
    .locals 1

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 6

    iget-object v0, p0, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-object v1, v0, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    const/4 v5, 0x4

    if-nez v4, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_4

    const/16 v4, 0x8

    if-ne v1, v4, :cond_1

    const/4 v5, 0x3

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unknown visibility "

    invoke-static {v1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move v5, v3

    goto :goto_0

    :cond_3
    move v5, v2

    :cond_4
    :goto_0
    iget v0, v0, Landroidx/fragment/app/p2;->a:I

    if-eq v5, v0, :cond_6

    if-eq v5, v3, :cond_5

    if-eq v0, v3, :cond_5

    goto :goto_1

    :cond_5
    return v2

    :cond_6
    :goto_1
    const/4 v0, 0x1

    return v0
.end method
