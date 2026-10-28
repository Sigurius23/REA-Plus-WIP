.class public final Lk1/d;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field public E:I

.field public final w:I

.field public final x:Ljava/util/ArrayList;

.field public final y:Ljava/util/ArrayList;

.field public final z:Lqg3/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x5

    iput v0, p0, Lk1/d;->w:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk1/d;->x:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lk1/d;->y:Ljava/util/ArrayList;

    new-instance v2, Lqg3/d;

    const/16 v3, 0x14

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lqg3/d;-><init>(IB)V

    iput-object v2, p0, Lk1/d;->z:Lqg3/d;

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    new-instance v2, Lk1/e;

    invoke-direct {v2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput p1, p0, Lk1/d;->E:I

    const p1, 0x7f0a076b

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lk1/a;)V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p1, Lk1/a;->Y:Lk1/e;

    invoke-static {p1}, La3/g;->h(La3/r;)V

    iget-object v0, p0, Lk1/d;->z:Lqg3/d;

    iget-object v1, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk1/e;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lk1/e;->c()V

    iget-object v2, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk1/e;

    if-eqz v3, :cond_0

    iget-object v0, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/a;

    :cond_0
    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lk1/d;->y:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final b(Lk1/a;)Lk1/e;
    .locals 5

    iget-object v0, p0, Lk1/d;->z:Lqg3/d;

    iget-object v1, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    iget-object v2, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashMap;

    iget-object v0, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk1/e;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v1, p0, Lk1/d;->y:Ljava/util/ArrayList;

    invoke-static {v1}, Lm83/s;->k1(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk1/e;

    if-nez v1, :cond_5

    iget v1, p0, Lk1/d;->E:I

    iget-object v3, p0, Lk1/d;->x:Ljava/util/ArrayList;

    invoke-static {v3}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v4

    if-le v1, v4, :cond_1

    new-instance v1, Lk1/e;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget v1, p0, Lk1/d;->E:I

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk1/e;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk1/a;

    if-eqz v3, :cond_3

    const/4 v4, 0x0

    iput-object v4, v3, Lk1/a;->Y:Lk1/e;

    invoke-static {v3}, La3/g;->h(La3/r;)V

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk1/e;

    if-eqz v4, :cond_2

    invoke-interface {v0, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk1/a;

    :cond_2
    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lk1/e;->c()V

    :cond_3
    :goto_0
    iget v3, p0, Lk1/d;->E:I

    iget v4, p0, Lk1/d;->w:I

    add-int/lit8 v4, v4, -0x1

    if-ge v3, v4, :cond_4

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lk1/d;->E:I

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    iput v3, p0, Lk1/d;->E:I

    :cond_5
    :goto_1
    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final requestLayout()V
    .locals 0

    return-void
.end method
