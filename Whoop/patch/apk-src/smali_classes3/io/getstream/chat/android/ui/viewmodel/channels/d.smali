.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/channels/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/d;->w:I

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/d;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/d;->x:Z

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->h(ZLio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/d;->x:Z

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->j(ZLio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
