.class public abstract Lrq0/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a+\u0010\u0008\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Leq0/x1;",
        "Ll83/a0;",
        "b",
        "(Leq0/x1;)V",
        "Landroid/view/View;",
        "root",
        "",
        "paddedViews",
        "c",
        "(Landroid/view/View;[Landroid/view/View;)V",
        "community_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a([Landroid/view/View;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 0

    invoke-static {p0, p1, p2}, Lrq0/u0;->d([Landroid/view/View;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Leq0/x1;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Leq0/x1;->i:Landroidx/recyclerview/widget/RecyclerView;

    const-string v2, "recyclerView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Leq0/x1;->b:Leq0/u2;

    iget-object p0, p0, Leq0/u2;->l:Landroid/widget/LinearLayout;

    const-string v2, "leaderBoardView"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/view/View;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object p0, v2, v1

    invoke-static {v0, v2}, Lrq0/u0;->c(Landroid/view/View;[Landroid/view/View;)V

    return-void
.end method

.method public static final varargs c(Landroid/view/View;[Landroid/view/View;)V
    .locals 2

    const-string v0, "root"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paddedViews"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrm/p;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    sget-object p1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p0, v0}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    return-void
.end method

.method private static final d([Landroid/view/View;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 6

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "windowInsets"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    iget-object v0, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v0, p1}, Lh5/o1;->g(I)Lv4/b;

    move-result-object p1

    iget p1, p1, Lv4/b;->d:I

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    invoke-virtual {v2, v3, v4, v5, p1}, Landroid/view/View;->setPadding(IIII)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method
