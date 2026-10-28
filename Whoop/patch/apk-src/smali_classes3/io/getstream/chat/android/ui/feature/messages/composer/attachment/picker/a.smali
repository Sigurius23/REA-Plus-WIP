.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->y:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->z:Ljava/lang/Object;

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->y:Ljava/lang/Object;

    check-cast v0, Lsq0/a;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->z:Ljava/lang/Object;

    check-cast v1, Lsq0/c;

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->x:I

    invoke-static {v0, v1, v2, p1}, Lsq0/c;->a(Lsq0/a;Lsq0/c;ILandroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->z:Ljava/lang/Object;

    check-cast v1, Landroid/widget/CheckedTextView;

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/a;->x:I

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->A(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;Landroid/widget/CheckedTextView;ILandroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
