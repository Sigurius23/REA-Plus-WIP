.class public final Lmq0/b;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lmq0/b;",
        "Landroidx/recyclerview/widget/o2;",
        "Leq0/m;",
        "categoryItemViewBinding",
        "Lkotlin/Function1;",
        "Liq0/t;",
        "Ll83/a0;",
        "widgetOnClickListener",
        "<init>",
        "(Leq0/m;Lkotlin/jvm/functions/Function1;)V",
        "Lbq0/b;",
        "dataWidget",
        "Ll83/k;",
        "",
        "authHeader",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "a",
        "(Lbq0/b;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V",
        "Leq0/m;",
        "b",
        "Lkotlin/jvm/functions/Function1;",
        "Lmq0/f;",
        "c",
        "Lmq0/f;",
        "dataWidgetImageAdapter",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Leq0/m;

.field private final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private c:Lmq0/f;


# direct methods
.method public constructor <init>(Leq0/m;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leq0/m;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "categoryItemViewBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widgetOnClickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lmq0/b;->a:Leq0/m;

    iput-object p2, p0, Lmq0/b;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Lbq0/b;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbq0/b;",
            "Ll83/k;",
            "Lcom/whoop/data/local/prefs/PreferenceHelper;",
            ")V"
        }
    .end annotation

    const-string v0, "dataWidget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferenceHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmq0/f;

    invoke-virtual {p1}, Lbq0/b;->b()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lmq0/b;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, p2, v2, p3}, Lmq0/f;-><init>(Ljava/util/List;Ll83/k;Lkotlin/jvm/functions/Function1;Lcom/whoop/data/local/prefs/PreferenceHelper;)V

    iput-object v0, p0, Lmq0/b;->c:Lmq0/f;

    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object p3, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    const/4 p3, 0x3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    iget-object p3, p0, Lmq0/b;->a:Leq0/m;

    iget-object v0, p3, Leq0/m;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    iget-object p2, p3, Leq0/m;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lmq0/b;->c:Lmq0/f;

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    iget-object p2, p3, Leq0/m;->a:Landroid/widget/TextView;

    iget-object p3, p0, Lmq0/b;->a:Leq0/m;

    invoke-virtual {p3}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1}, Lbq0/b;->f()I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string p1, "dataWidgetImageAdapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
