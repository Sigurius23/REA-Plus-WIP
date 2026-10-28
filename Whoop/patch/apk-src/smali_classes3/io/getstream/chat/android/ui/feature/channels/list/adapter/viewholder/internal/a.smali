.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;->x:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;->x:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->d(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;->x:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->e(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;->x:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->f(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;->x:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->c(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
