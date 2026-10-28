.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "run",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $contentView$inlined:Landroid/view/View;

.field final synthetic $data$inlined:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

.field final synthetic $reactionsSpace$inlined:Landroid/view/View;

.field final synthetic $reactionsView$inlined:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

.field final synthetic $rootConstraintLayout$inlined:Landroidx/constraintlayout/widget/ConstraintLayout;

.field final synthetic $this_doOnPreDraw:Landroid/view/View;

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;


# direct methods
.method public constructor <init>(Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$this_doOnPreDraw:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$rootConstraintLayout$inlined:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$reactionsSpace$inlined:Landroid/view/View;

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$reactionsView$inlined:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$data$inlined:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    iput-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$contentView$inlined:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$rootConstraintLayout$inlined:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$reactionsSpace$inlined:Landroid/view/View;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$reactionsView$inlined:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$data$inlined:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-static {v0, v1, v2, v3, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->access$calculateDynamicOffset(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$contentView$inlined:Landroid/view/View;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$reactionsSpace$inlined:Landroid/view/View;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;->$data$inlined:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-static {v1, v2, v3, v4, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->access$updateOffset(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;I)V

    return-void
.end method
