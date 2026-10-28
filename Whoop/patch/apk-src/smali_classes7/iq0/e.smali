.class public final Liq0/e;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/i1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010!\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\u000b\u001a\u00020\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Liq0/e;",
        "Landroidx/recyclerview/widget/i1;",
        "Llq0/b;",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/User;",
        "Ll83/a0;",
        "onMentionClick",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "",
        "items",
        "setItems",
        "(Ljava/util/List;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "c",
        "(Landroid/view/ViewGroup;I)Llq0/b;",
        "getItemCount",
        "()I",
        "holder",
        "position",
        "b",
        "(Llq0/b;I)V",
        "a",
        "Lkotlin/jvm/functions/Function1;",
        "",
        "Ljava/util/List;",
        "users",
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
.field private final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onMentionClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    iput-object p1, p0, Liq0/e;->a:Lkotlin/jvm/functions/Function1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Liq0/e;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Llq0/b;Liq0/e;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Liq0/e;->d(Llq0/b;Liq0/e;Landroid/view/View;)V

    return-void
.end method

.method private static final d(Llq0/b;Liq0/e;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getBindingAdapterPosition()I

    move-result p0

    const/4 p2, -0x1

    if-eq p0, p2, :cond_0

    iget-object p2, p1, Liq0/e;->a:Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Liq0/e;->b:Ljava/util/List;

    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public b(Llq0/b;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Liq0/e;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/User;

    invoke-virtual {p1, p2}, Llq0/b;->bind(Lio/getstream/chat/android/models/User;)V

    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Llq0/b;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Llq0/b;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p2, p1, v0, v1, v0}, Llq0/b;-><init>(Landroid/view/ViewGroup;Leq0/h0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v0, Liq0/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Liq0/a;-><init>(Landroidx/recyclerview/widget/i1;Landroidx/recyclerview/widget/o2;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Liq0/e;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    check-cast p1, Llq0/b;

    invoke-virtual {p0, p1, p2}, Liq0/e;->b(Llq0/b;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Liq0/e;->c(Landroid/view/ViewGroup;I)Llq0/b;

    move-result-object p1

    return-object p1
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Liq0/e;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Liq0/e;->b:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method
