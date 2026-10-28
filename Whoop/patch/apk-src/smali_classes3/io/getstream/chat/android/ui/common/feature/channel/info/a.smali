.class public final synthetic Lio/getstream/chat/android/ui/common/feature/channel/info/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/a;->x:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/a;->x:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->c(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lio/getstream/chat/android/models/Channel;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/a;->x:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    check-cast p1, Ln23/e;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->g(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ln23/e;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/a;->x:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    check-cast p1, Ln23/e;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->f(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ln23/e;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
