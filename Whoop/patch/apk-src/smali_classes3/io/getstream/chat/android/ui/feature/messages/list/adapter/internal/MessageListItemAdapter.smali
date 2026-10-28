.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0012\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J5\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00032\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008-\u0010/\"\u0004\u00080\u00101\u00a8\u00062"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;",
        "viewHolderFactory",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;)V",
        "",
        "position",
        "",
        "getItemId",
        "(I)J",
        "getItemViewType",
        "(I)I",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "holder",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;I)V",
        "",
        "",
        "payloads",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;ILjava/util/List;)V",
        "onViewRecycled",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V",
        "onViewAttachedToWindow",
        "onViewDetachedFromWindow",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "onAttachedToRecyclerView",
        "(Landroidx/recyclerview/widget/RecyclerView;)V",
        "onDetachedFromRecyclerView",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "",
        "isThread",
        "Z",
        "()Z",
        "setThread",
        "(Z)V",
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
.field private isThread:Z

.field private final logger$delegate:Ll83/h;

.field private final viewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;)V
    .locals 4

    const-string v0, "viewHolderFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    const-string p1, "Chat:MessageListAdapter"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->logger$delegate:Ll83/h;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->z:Lb23/g;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "<init> no args"

    const/4 v3, 0x0

    invoke-interface {p1, v1, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/i1;->setHasStableIds(Z)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->onDetachedFromRecyclerView$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->onAttachedToRecyclerView$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)Ll83/a0;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private static final onAttachedToRecyclerView$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->onAttachedToWindow()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onDetachedFromRecyclerView$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->onDetachedFromWindow()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final getItemId(I)J
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;->getStableId()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I

    move-result p1

    return p1
.end method

.method public final isThread()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->isThread:Z

    return v0
.end method

.method public final onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    new-instance v0, Lu0/r;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lu0/r;-><init>(I)V

    invoke-static {p0, p1, v0}, Lio/getstream/chat/android/ui/common/extensions/internal/RecyclerViewKt;->doForAllViewHolders(Landroidx/recyclerview/widget/i1;Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;I)V

    return-void
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;ILjava/util/List;)V
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;ILjava/util/List;)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I

    move-result v0

    .line 5
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 6
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->getLogger()Lb23/k;

    move-result-object p1

    .line 7
    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    .line 8
    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {p2, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 9
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 10
    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewType;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewType;

    invoke-virtual {p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewType;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-virtual {p2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewType;->toString(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "[onBindViewHolder] #regular; viewType mismatch; item: "

    const-string v4, ", viewHolder: "

    .line 12
    invoke-static {v1, v0, v4, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 13
    invoke-interface {p1, v3, v2, p2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    .line 14
    :cond_1
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->access$getFULL$cp()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move-result-object v0

    .line 16
    invoke-virtual {p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->bindListItem$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;ILjava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    check-cast p3, Ljava/lang/Iterable;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    const/4 v1, 0x0

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    .line 27
    sget-object p3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff$Companion;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->access$getFULL$cp()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move-result-object p3

    .line 29
    invoke-static {p3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :cond_3
    check-cast v0, Ljava/lang/Iterable;

    .line 30
    sget-object p3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff$Companion;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->access$getEMPTY$cp()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move-result-object p3

    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    .line 33
    invoke-virtual {p3, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->plus(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move-result-object p3

    goto :goto_2

    .line 34
    :cond_4
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    .line 35
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I

    move-result v0

    .line 36
    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    invoke-virtual {v2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)I

    move-result v2

    if-eq v0, v2, :cond_6

    .line 37
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->getLogger()Lb23/k;

    move-result-object p1

    .line 38
    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object p3, p1, Lb23/k;->a:Ljava/lang/String;

    .line 39
    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {p2, v3, p3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 40
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 41
    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewType;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewType;

    invoke-virtual {p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewType;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-virtual {p2, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewType;->toString(I)Ljava/lang/String;

    move-result-object p2

    const-string v2, "[onBindViewHolder] #payloads; viewType mismatch; item: "

    const-string v4, ", viewHolder: "

    .line 43
    invoke-static {v2, v0, v4, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 44
    invoke-interface {p1, v3, p3, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    return-void

    .line 45
    :cond_6
    invoke-virtual {p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->bindListItem$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 1
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

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu0/r;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lu0/r;-><init>(I)V

    invoke-static {p0, p1, v0}, Lio/getstream/chat/android/ui/common/extensions/internal/RecyclerViewKt;->doForAllViewHolders(Landroidx/recyclerview/widget/i1;Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public final bridge synthetic onViewAttachedToWindow(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->onViewAttachedToWindow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V

    return-void
.end method

.method public final onViewAttachedToWindow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onViewAttachedToWindow(Landroidx/recyclerview/widget/o2;)V

    .line 3
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->onAttachedToWindow()V

    return-void
.end method

.method public final bridge synthetic onViewDetachedFromWindow(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->onViewDetachedFromWindow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->onDetachedFromWindow()V

    .line 3
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onViewDetachedFromWindow(Landroidx/recyclerview/widget/o2;)V

    return-void
.end method

.method public final bridge synthetic onViewRecycled(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->onViewRecycled(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V

    return-void
.end method

.method public final onViewRecycled(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->onViewRecycled(Landroidx/recyclerview/widget/o2;)V

    .line 3
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->unbind()V

    return-void
.end method

.method public final setThread(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->isThread:Z

    return-void
.end method
