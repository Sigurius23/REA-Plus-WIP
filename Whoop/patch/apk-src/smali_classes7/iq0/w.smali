.class public final Liq0/w;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B-\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u0011\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\r2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0019R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Liq0/w;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;",
        "",
        "accessToken",
        "whoopUserName",
        "Lkotlin/Function1;",
        "Liq0/s;",
        "Ll83/a0;",
        "eventListener",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "Landroid/view/ViewGroup;",
        "parentView",
        "",
        "viewType",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "createViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "item",
        "getItemViewType",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I",
        "viewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)I",
        "a",
        "Ljava/lang/String;",
        "b",
        "c",
        "Lkotlin/jvm/functions/Function1;",
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
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "whoopUserName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;-><init>()V

    iput-object p1, p0, Liq0/w;->a:Ljava/lang/String;

    iput-object p2, p0, Liq0/w;->b:Ljava/lang/String;

    iput-object p3, p0, Liq0/w;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0}, Liq0/w;->c(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0}, Liq0/w;->d(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final c(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final d(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;"
        }
    .end annotation

    const-string v0, "parentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Liq0/x;->a()Ljava/util/Set;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v1, Llq0/g;

    iget-object v3, p0, Liq0/w;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getListeners()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMessageLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v4, p2

    goto :goto_2

    :cond_1
    :goto_1
    new-instance p2, Liq0/u;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getListeners()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getThreadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    move-object v5, p2

    goto :goto_5

    :cond_3
    :goto_4
    new-instance p2, Liq0/v;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_3

    :goto_5
    iget-object v6, p0, Liq0/w;->b:Ljava/lang/String;

    iget-object v7, p0, Liq0/w;->c:Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v10}, Llq0/g;-><init>(Landroid/view/ViewGroup;Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leq0/j0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_4
    move-object v2, p1

    const/16 p1, 0x3ee

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-ne p2, p1, :cond_5

    new-instance p1, Llq0/h;

    invoke-direct {p1, v2, v1, v0, v1}, Llq0/h;-><init>(Landroid/view/ViewGroup;Leq0/c3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_5
    const/16 p1, 0x3ea

    if-ne p2, p1, :cond_6

    new-instance p1, Llq0/a;

    invoke-direct {p1, v2, v1, v0, v1}, Llq0/a;-><init>(Landroid/view/ViewGroup;Leq0/a3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_6
    invoke-super {p0, v2, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;)I"
        }
    .end annotation

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    instance-of v0, p1, Llq0/g;

    if-eqz v0, :cond_0

    const/16 p1, 0x3eb

    return p1

    .line 4
    :cond_0
    instance-of v0, p1, Llq0/h;

    if-eqz v0, :cond_1

    const/16 p1, 0x3ee

    return p1

    .line 5
    :cond_1
    instance-of v0, p1, Llq0/a;

    if-eqz v0, :cond_2

    const/16 p1, 0x3ea

    return p1

    .line 6
    :cond_2
    invoke-super {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)I

    move-result p1

    return p1
.end method

.method public getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I

    move-result p1

    .line 2
    invoke-static {}, Liq0/x;->a()Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p1, 0x3eb

    :cond_0
    return p1
.end method
