.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/g;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/g;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/g;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    check-cast p1, Ln23/e;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->n(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ln23/e;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/g;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    check-cast p1, Ln23/e;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->g(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ln23/e;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/g;->x:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->f(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
