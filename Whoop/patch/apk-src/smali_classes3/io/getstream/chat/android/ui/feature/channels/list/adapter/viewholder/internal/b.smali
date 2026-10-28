.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;->a:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;->b:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->a(Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;Landroid/view/View;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;->b:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->b(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
