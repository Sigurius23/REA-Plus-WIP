.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->C(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->z(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->E(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->D(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
