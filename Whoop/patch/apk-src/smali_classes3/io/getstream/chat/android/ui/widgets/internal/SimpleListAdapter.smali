.class public abstract Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "VH:",
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder<",
        "TT;>;>",
        "Landroidx/recyclerview/widget/i1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0010!\n\u0002\u0008\u0007\u0008 \u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u000e\u0008\u0001\u0010\u0004*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0008\u0012\u0004\u0012\u00028\u00010\u0005:\u0001 B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0017\u0010\u0007J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u0001H\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R(\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010\u0013\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;",
        "",
        "T",
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;",
        "VH",
        "Landroidx/recyclerview/widget/i1;",
        "<init>",
        "()V",
        "",
        "getItemCount",
        "()I",
        "holder",
        "position",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;I)V",
        "",
        "items",
        "setItems",
        "(Ljava/util/List;)V",
        "item",
        "removeItem",
        "(Ljava/lang/Object;)V",
        "clear",
        "onViewRecycled",
        "(Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;)V",
        "",
        "itemList",
        "Ljava/util/List;",
        "getItemList",
        "()Ljava/util/List;",
        "setItemList",
        "ViewHolder",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private itemList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItemList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    return-object v0
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;I)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;->bind(Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic onViewRecycled(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->onViewRecycled(Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;)V

    return-void
.end method

.method public final onViewRecycled(Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onViewRecycled(Landroidx/recyclerview/widget/o2;)V

    .line 3
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;->unbind()V

    return-void
.end method

.method public final removeItem(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/i1;->notifyItemRemoved(I)V

    :cond_0
    return-void
.end method

.method public final setItemList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;->itemList:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method
