.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u001a2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
        "decorators",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;)V",
        "data",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "Ll83/a0;",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;",
        "Companion",
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


# static fields
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder$Companion;

.field private static final DEFAULT_CORNER_RADIUS:F


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder$Companion;

    const/16 v0, 0x10

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->DEFAULT_CORNER_RADIUS:F

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "decorators"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "style"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p4}, Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;-><init>(Landroid/view/View;Ljava/util/List;)V

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p4

    const/4 p5, 0x0

    .line 2
    invoke-static {p4, p1, p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;

    move-result-object p4

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;)V

    return-void
.end method


# virtual methods
.method public final bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 12

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    .line 3
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;->dateLabel:Landroid/widget/TextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;->getDate()Ljava/util/Date;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->formatRelativeDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;->dateLabel:Landroid/widget/TextView;

    const-string p2, "dateLabel"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleDateSeparator()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    .line 5
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;->dateLabel:Landroid/widget/TextView;

    .line 6
    new-instance p2, Lkr/i;

    .line 7
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Lkr/i;

    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v1, Lkr/i;

    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v2, Lkr/i;

    .line 13
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v3, Lkr/e;

    const/4 v4, 0x0

    .line 15
    invoke-direct {v3, v4}, Lkr/e;-><init>(I)V

    .line 16
    new-instance v4, Lkr/e;

    const/4 v5, 0x0

    .line 17
    invoke-direct {v4, v5}, Lkr/e;-><init>(I)V

    .line 18
    new-instance v5, Lkr/e;

    const/4 v6, 0x0

    .line 19
    invoke-direct {v5, v6}, Lkr/e;-><init>(I)V

    .line 20
    new-instance v6, Lkr/e;

    const/4 v7, 0x0

    .line 21
    invoke-direct {v6, v7}, Lkr/e;-><init>(I)V

    .line 22
    sget v7, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->DEFAULT_CORNER_RADIUS:F

    .line 23
    new-instance v8, Lkr/a;

    invoke-direct {v8, v7}, Lkr/a;-><init>(F)V

    .line 24
    new-instance v9, Lkr/a;

    invoke-direct {v9, v7}, Lkr/a;-><init>(F)V

    .line 25
    new-instance v10, Lkr/a;

    invoke-direct {v10, v7}, Lkr/a;-><init>(F)V

    .line 26
    new-instance v11, Lkr/a;

    invoke-direct {v11, v7}, Lkr/a;-><init>(F)V

    .line 27
    new-instance v7, Lkr/k;

    .line 28
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p2, v7, Lkr/k;->a:Lse/a;

    .line 30
    iput-object v0, v7, Lkr/k;->b:Lse/a;

    .line 31
    iput-object v1, v7, Lkr/k;->c:Lse/a;

    .line 32
    iput-object v2, v7, Lkr/k;->d:Lse/a;

    .line 33
    iput-object v8, v7, Lkr/k;->e:Lkr/c;

    .line 34
    iput-object v9, v7, Lkr/k;->f:Lkr/c;

    .line 35
    iput-object v10, v7, Lkr/k;->g:Lkr/c;

    .line 36
    iput-object v11, v7, Lkr/k;->h:Lkr/c;

    .line 37
    iput-object v3, v7, Lkr/k;->i:Lkr/e;

    .line 38
    iput-object v4, v7, Lkr/k;->j:Lkr/e;

    .line 39
    iput-object v5, v7, Lkr/k;->k:Lkr/e;

    .line 40
    iput-object v6, v7, Lkr/k;->l:Lkr/e;

    .line 41
    new-instance p2, Lkr/g;

    invoke-direct {p2, v7}, Lkr/g;-><init>(Lkr/k;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getDateSeparatorBackgroundColor()I

    move-result v0

    invoke-virtual {p2, v0}, Lkr/g;->setTint(I)V

    .line 42
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;

    return-object v0
.end method

.method public final getStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    return-object v0
.end method
