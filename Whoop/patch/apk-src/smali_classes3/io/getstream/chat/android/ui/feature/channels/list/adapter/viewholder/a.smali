.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->a(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->b(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;->w:I

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->a(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->b(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
