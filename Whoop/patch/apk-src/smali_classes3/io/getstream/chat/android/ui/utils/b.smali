.class public final synthetic Lio/getstream/chat/android/ui/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmr/n;


# direct methods
.method public synthetic constructor <init>(Lmr/n;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/utils/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/utils/b;->x:Lmr/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/utils/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/utils/b;->x:Lmr/n;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lmr/l;->a(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/b;->x:Lmr/n;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->e(Lmr/n;Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
