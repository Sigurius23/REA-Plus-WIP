.class Lcom/whoop/whooplive/selfie/SelfieActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplive/selfie/SelfieActivity;->O0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Landroidx/viewpager/widget/ViewPager;

.field final synthetic x:Lcom/whoop/whooplive/selfie/SelfieActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroidx/viewpager/widget/ViewPager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    iput-object p2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/viewpager/widget/ViewPager;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->c(Landroidx/viewpager/widget/ViewPager;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/whooplive/selfie/SelfieActivity$h;Landroidx/viewpager/widget/ViewPager;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->d(Lcom/whoop/whooplive/selfie/SelfieActivity$h;Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method

.method private static synthetic c(Landroidx/viewpager/widget/ViewPager;Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/viewpager/widget/ViewPager;->D(IZ)V

    return-void
.end method

.method private static synthetic d(Lcom/whoop/whooplive/selfie/SelfieActivity$h;Landroidx/viewpager/widget/ViewPager;)V
    .locals 0

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity$h;->c(I)V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 5

    new-instance v0, Lcom/whoop/whooplive/selfie/SelfieActivity$h;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/whooplive/selfie/SelfieActivity$h;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroidx/viewpager/widget/ViewPager;I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->c(Lfc/g;)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    new-instance v2, Lcom/whoop/whooplive/selfie/c;

    invoke-direct {v2, v1}, Lcom/whoop/whooplive/selfie/c;-><init>(Landroidx/viewpager/widget/ViewPager;)V

    new-instance v1, Lcom/whoop/whooplive/selfie/a;

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v3}, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Z

    move-result v4

    invoke-direct {v1, v3, v4, v2}, Lcom/whoop/whooplive/selfie/a;-><init>(Landroid/content/Context;ZLandroid/view/View$OnClickListener;)V

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lfc/a;)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-virtual {v2}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lpz2/c;->a:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    iget-object v4, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    invoke-virtual {v2, v1, v3, v1, v4}, Landroid/view/View;->setPadding(IIII)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    new-instance v2, Lcom/whoop/whooplive/selfie/d;

    invoke-direct {v2, v0, v1}, Lcom/whoop/whooplive/selfie/d;-><init>(Lcom/whoop/whooplive/selfie/SelfieActivity$h;Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Luz2/b;->OVERVIEW:Luz2/b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const-string v2, "selfieMode"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->m0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    :cond_0
    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v1

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method
