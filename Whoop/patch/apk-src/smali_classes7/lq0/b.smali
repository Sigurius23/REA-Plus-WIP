.class public final Llq0/b;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Llq0/b;",
        "Landroidx/recyclerview/widget/o2;",
        "Landroid/view/ViewGroup;",
        "parent",
        "Leq0/h0;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Leq0/h0;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/models/User;)V",
        "a",
        "Leq0/h0;",
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
.field private final a:Leq0/h0;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Leq0/h0;)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    .line 5
    iput-object p2, p0, Llq0/b;->a:Leq0/h0;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Leq0/h0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x0

    invoke-static {p2, p1, p3}, Leq0/h0;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/h0;

    move-result-object p2

    const-string p3, "inflate(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Llq0/b;-><init>(Landroid/view/ViewGroup;Leq0/h0;)V

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/models/User;)V
    .locals 5

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llq0/b;->a:Leq0/h0;

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getImage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v1

    sget-object v2, Lzk/k;->e:Lzk/k;

    invoke-virtual {v1, v2}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    sget v2, Lvu1/c;->n:I

    invoke-virtual {v1, v2}, Lpl/a;->j(I)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    iget-object v2, v0, Leq0/h0;->b:Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    iget-object v1, v0, Leq0/h0;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getExtraData()Ljava/util/Map;

    move-result-object v2

    const-string v3, "first_name"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getExtraData()Ljava/util/Map;

    move-result-object v3

    const-string v4, "last_name"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Leq0/h0;->c:Landroid/widget/TextView;

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lxp0/d0;->P:I

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p1

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "toLowerCase(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
