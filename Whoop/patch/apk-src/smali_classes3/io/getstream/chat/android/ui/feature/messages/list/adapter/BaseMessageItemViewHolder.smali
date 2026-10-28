.class public abstract Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        ">",
        "Landroidx/recyclerview/widget/o2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0012\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0008H\u0017\u00a2\u0006\u0004\u0008\u0015\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\nJ\u000f\u0010\u0018\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\nR\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR$\u0010\u0013\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u00008\u0006@BX\u0086.\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010!\u001a\u0004\u0008\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u001a\u0010(\u001a\u00020\'8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "T",
        "Landroidx/recyclerview/widget/o2;",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Landroid/view/View;)V",
        "Ll83/a0;",
        "cancelHighlightAnimation",
        "()V",
        "messageContainerView",
        "()Landroid/view/View;",
        "messageListItem",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "bindListItem$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "bindListItem",
        "data",
        "bindData",
        "unbind",
        "startHighlightAnimation$stream_chat_android_ui_components_release",
        "startHighlightAnimation",
        "onDetachedFromWindow",
        "onAttachedToWindow",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "value",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "getData",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "Landroid/animation/ValueAnimator;",
        "highlightAnimation",
        "Landroid/animation/ValueAnimator;",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
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
.field private final context:Landroid/content/Context;

.field private data:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private highlightAnimation:Landroid/animation/ValueAnimator;

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    const-string v0, "Chat:MessageItemBaseVH"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->logger$delegate:Ll83/h;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->context:Landroid/content/Context;

    return-void
.end method

.method private final cancelHighlightAnimation()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->highlightAnimation:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->highlightAnimation:Landroid/animation/ValueAnimator;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public abstract bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
            ")V"
        }
    .end annotation
.end method

.method public final bindListItem$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 3

    const-string v0, "messageListItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->data:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v1, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string v0, "[bindListItem] failed: "

    invoke-static {v0, p1}, Lb9/y;->n(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v2, v1, v0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    throw p1
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->data:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "data"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public messageContainerView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 0

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    return-void
.end method

.method public final startHighlightAnimation$stream_chat_android_ui_components_release()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lio/getstream/chat/android/ui/common/internal/AnimationUtilsKt;->animateHighlight$default(Landroid/view/View;IILjava/lang/Object;)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->highlightAnimation:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public unbind()V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->cancelHighlightAnimation()V

    return-void
.end method
