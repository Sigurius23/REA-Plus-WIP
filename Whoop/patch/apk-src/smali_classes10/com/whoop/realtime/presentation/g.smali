.class public final Lcom/whoop/realtime/presentation/g;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\r\u001a\u00020\u00062\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/g;",
        "Landroidx/recyclerview/widget/o2;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "Lkotlin/Function1;",
        "Lcom/whoop/realtime/presentation/c$a;",
        "Ll83/a0;",
        "onClick",
        "<init>",
        "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V",
        "",
        "Lcom/whoop/realtime/presentation/c;",
        "list",
        "a",
        "(Ljava/util/List;)V",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "b",
        "()Landroidx/recyclerview/widget/RecyclerView;",
        "Lcom/whoop/realtime/presentation/b;",
        "Lcom/whoop/realtime/presentation/b;",
        "adapter",
        "realtime-activity_release"
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
.field private final a:Landroidx/recyclerview/widget/RecyclerView;

.field private final b:Lcom/whoop/realtime/presentation/b;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/g;->a:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/whoop/realtime/presentation/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1, p2}, Lcom/whoop/realtime/presentation/b;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/g;->b:Lcom/whoop/realtime/presentation/b;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/realtime/presentation/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/g;->b:Lcom/whoop/realtime/presentation/b;

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/b;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/whoop/realtime/presentation/g;->b:Lcom/whoop/realtime/presentation/b;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method

.method public final b()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/g;->a:Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method
