.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/c;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/c;->x:Lc93/a;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->a0(Lc93/a;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/c;->x:Lc93/a;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->e0(Lc93/a;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
