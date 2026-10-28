.class Lcom/whoop/whooplive/selfie/SelfieActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplive/selfie/SelfieActivity;->L0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Landroid/view/View;

.field final synthetic x:Lcom/whoop/whooplive/selfie/SelfieActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    iput-object p2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->w:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    sub-int/2addr v2, v1

    div-int/lit8 v2, v2, 0x2

    iput v2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v3, v0

    div-int/lit8 v3, v3, 0x2

    iput v3, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    invoke-virtual {p1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v0

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->u:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v1

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->u:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    if-lez v0, :cond_0

    if-lez v1, :cond_0

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v2

    iget-object v2, v2, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->u:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v0

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v3}, Lcom/whoop/whooplive/selfie/SelfieActivity;->u0(Lcom/whoop/whooplive/selfie/SelfieActivity;)I

    move-result v3

    sub-int/2addr v0, v3

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-virtual {v3}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lvu1/b;->b:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    sub-int/2addr v0, v3

    sub-int/2addr v0, v1

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v0

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->u:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v0

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->v:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v0

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->w:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object v0

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->x:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$b;->w:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method
