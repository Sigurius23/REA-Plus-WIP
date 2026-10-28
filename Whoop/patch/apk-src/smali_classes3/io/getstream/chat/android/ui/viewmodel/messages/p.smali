.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/w1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/p;->a:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/p;->b:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/p;->b:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p2, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->r(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/p;->b:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p2, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->t(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
