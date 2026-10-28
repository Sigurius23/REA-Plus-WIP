.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/channels/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/lifecycle/t0;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/t0;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/g;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/g;->x:Landroidx/lifecycle/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/g;->x:Landroidx/lifecycle/t0;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->g(Landroidx/lifecycle/t0;Ljava/util/Map;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/g;->x:Landroidx/lifecycle/t0;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->e(Landroidx/lifecycle/t0;Ljava/util/Map;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/g;->x:Landroidx/lifecycle/t0;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->a(Landroidx/lifecycle/t0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/g;->x:Landroidx/lifecycle/t0;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->f(Landroidx/lifecycle/t0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
