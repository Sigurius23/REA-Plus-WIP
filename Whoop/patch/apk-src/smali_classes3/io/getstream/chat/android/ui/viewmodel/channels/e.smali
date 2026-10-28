.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/channels/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/e;->w:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/e;->x:Ljava/lang/Object;

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/e;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/e;->y:Ljava/lang/Object;

    check-cast v1, Lp92/e;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->O(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/e;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/e;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    invoke-static {v0, v1, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->d(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
