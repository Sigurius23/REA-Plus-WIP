.class Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfc/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;


# direct methods
.method private constructor <init>(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;-><init>(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)V

    return-void
.end method


# virtual methods
.method public a(IFI)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->a(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lcom/whoop/realtime/presentation/views/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_2

    if-ltz p1, :cond_2

    if-lt p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->a(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lcom/whoop/realtime/presentation/views/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/whoop/realtime/presentation/views/a;->a(IF)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->a(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lcom/whoop/realtime/presentation/views/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int v0, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v1, p1, v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->d(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;II)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->c(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lfc/g;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->c(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lfc/g;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lfc/g;->a(IFI)V

    :cond_2
    :goto_1
    return-void
.end method

.method public b(I)V
    .locals 1

    iput p1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->a:I

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->c(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lfc/g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->c(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lfc/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lfc/g;->b(I)V

    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 4

    iget v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->a:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->a(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lcom/whoop/realtime/presentation/views/a;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Lcom/whoop/realtime/presentation/views/a;->a(IF)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0, p1, v1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->d(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;II)V

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v2}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->a(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lcom/whoop/realtime/presentation/views/a;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v2}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->a(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lcom/whoop/realtime/presentation/views/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-ne p1, v0, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setSelected(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->c(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lfc/g;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;->b:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->c(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lfc/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lfc/g;->c(I)V

    :cond_3
    return-void
.end method
