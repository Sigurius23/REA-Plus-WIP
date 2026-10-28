.class Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;


# direct methods
.method private constructor <init>(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$b;->w:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$b;-><init>(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$b;->w:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->a(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lcom/whoop/realtime/presentation/views/a;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$b;->w:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {v1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->a(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lcom/whoop/realtime/presentation/views/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$b;->w:Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;

    invoke-static {p1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->b(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
