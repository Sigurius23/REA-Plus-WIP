.class public Lcom/whoop/ui/WhoopToastView;
.super Landroid/widget/TextView;
.source "SourceFile"


# instance fields
.field private w:Landroid/graphics/drawable/GradientDrawable;

.field private x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/whoop/ui/WhoopToastView;->a()V

    return-void
.end method

.method private a()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnf1/c;->a:I

    invoke-static {v0, v1}, Lin2/j;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lcom/whoop/ui/WhoopToastView;->w:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public setBackgroundColorResource(I)V
    .locals 2

    iget-boolean v0, p0, Lcom/whoop/ui/WhoopToastView;->x:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/WhoopToastView;->w:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/GradientDrawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lcom/whoop/ui/WhoopToastView;->w:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/WhoopToastView;->w:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-void
.end method
