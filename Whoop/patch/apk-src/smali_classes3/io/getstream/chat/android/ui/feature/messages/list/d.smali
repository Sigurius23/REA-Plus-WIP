.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/d;->w:I

    packed-switch p2, :pswitch_data_0

    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->$$delegatedProperties:[Lj93/z;

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    :pswitch_0
    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->$$delegatedProperties:[Lj93/z;

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
