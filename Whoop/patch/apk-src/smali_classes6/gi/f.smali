.class public final Lgi/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgi/j;


# instance fields
.field public final b:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi/f;->b:Landroid/widget/ImageView;

    return-void
.end method

.method public static b(III)Lgi/c;
    .locals 1

    const/4 v0, -0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lgi/b;->a:Lgi/b;

    return-object p0

    :cond_0
    sub-int/2addr p0, p2

    const-string v0, "px must be > 0."

    if-lez p0, :cond_2

    if-lez p0, :cond_1

    new-instance p1, Lgi/a;

    invoke-direct {p1, p0}, Lgi/a;-><init>(I)V

    return-object p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    sub-int/2addr p1, p2

    if-lez p1, :cond_4

    if-lez p1, :cond_3

    new-instance p0, Lgi/a;

    invoke-direct {p0, p1}, Lgi/a;-><init>(I)V

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Lrh/s;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lgi/f;->c()Lgi/i;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    iget-object p1, p0, Lgi/f;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v1, Lgi/l;

    invoke-direct {v1, p0, p1, v0}, Lgi/l;-><init>(Lgi/f;Landroid/view/ViewTreeObserver;Lbc3/m;)V

    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    new-instance v2, Lgi/k;

    invoke-direct {v2, p0, p1, v1}, Lgi/k;-><init>(Lgi/f;Landroid/view/ViewTreeObserver;Lgi/l;)V

    invoke-virtual {v0, v2}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final c()Lgi/i;
    .locals 6

    iget-object v0, p0, Lgi/f;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    add-int/2addr v5, v4

    invoke-static {v1, v3, v5}, Lgi/f;->b(III)Lgi/c;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v2, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    add-int/2addr v0, v4

    invoke-static {v2, v3, v0}, Lgi/f;->b(III)Lgi/c;

    move-result-object v0

    if-nez v0, :cond_3

    :goto_1
    const/4 v0, 0x0

    return-object v0

    :cond_3
    new-instance v2, Lgi/i;

    invoke-direct {v2, v1, v0}, Lgi/i;-><init>(Lgi/c;Lgi/c;)V

    return-object v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lgi/f;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lgi/f;

    iget-object v1, p0, Lgi/f;->b:Landroid/widget/ImageView;

    iget-object p1, p1, Lgi/f;->b:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lgi/f;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RealViewSizeResolver(view="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lgi/f;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtractPadding=true)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
