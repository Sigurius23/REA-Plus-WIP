.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field public final synthetic y:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;->y:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;->y:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;->y:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
