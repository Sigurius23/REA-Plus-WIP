.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/t0;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/t0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/t0;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/t0;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->L(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V

    return-void

    :pswitch_0
    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_1
    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_2
    check-cast v1, Lc93/a;

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->$$delegatedProperties:[Lj93/z;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_3
    check-cast v1, Lc93/a;

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->$$delegatedProperties:[Lj93/z;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
