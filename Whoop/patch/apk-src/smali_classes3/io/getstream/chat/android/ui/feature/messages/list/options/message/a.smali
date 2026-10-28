.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/y;->dismiss()V

    return-void

    :pswitch_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/y;->dismiss()V

    return-void

    :pswitch_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/y;->dismiss()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
