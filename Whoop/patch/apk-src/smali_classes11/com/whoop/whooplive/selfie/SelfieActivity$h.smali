.class Lcom/whoop/whooplive/selfie/SelfieActivity$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfc/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/selfie/SelfieActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field private a:Landroidx/viewpager/widget/ViewPager;

.field final synthetic b:Lcom/whoop/whooplive/selfie/SelfieActivity;


# direct methods
.method private constructor <init>(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroidx/viewpager/widget/ViewPager;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->b:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->a:Landroidx/viewpager/widget/ViewPager;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroidx/viewpager/widget/ViewPager;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/whoop/whooplive/selfie/SelfieActivity$h;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method


# virtual methods
.method public a(IFI)V
    .locals 0

    return-void
.end method

.method public b(I)V
    .locals 0

    return-void
.end method

.method public c(I)V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->a:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x1

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->a:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-ne v1, p1, :cond_0

    goto :goto_1

    :cond_0
    move v3, v0

    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setSelected(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->b:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Z

    move-result v1

    if-nez v1, :cond_2

    add-int/lit8 p1, p1, 0x1

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->b:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->o0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Llh3/b;

    move-result-object v1

    invoke-virtual {v1}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->EDITING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    if-ne v1, v2, :cond_3

    invoke-static {}, Luz2/b;->values()[Luz2/b;

    move-result-object v1

    aget-object v1, v1, p1

    sget-object v2, Luz2/b;->LIVE:Luz2/b;

    if-ne v1, v2, :cond_3

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->a:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v3}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->b:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {}, Luz2/b;->values()[Luz2/b;

    move-result-object v2

    aget-object v2, v2, p1

    sget-object v4, Luz2/b;->LIVE:Luz2/b;

    if-ne v2, v4, :cond_4

    move v0, v3

    :cond_4
    invoke-static {v1, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->t0(Lcom/whoop/whooplive/selfie/SelfieActivity;Z)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->b:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v0

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->b:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v0

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-static {}, Luz2/b;->values()[Luz2/b;

    move-result-object v1

    aget-object p1, v1, p1

    invoke-virtual {v0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->setMode(Luz2/b;)V

    :cond_5
    return-void
.end method
