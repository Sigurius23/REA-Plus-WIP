.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

.field public final synthetic y:Lio/getstream/chat/android/models/Poll;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->y:Lio/getstream/chat/android/models/Poll;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->y:Lio/getstream/chat/android/models/Poll;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->C(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->y:Lio/getstream/chat/android/models/Poll;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->x(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->y:Lio/getstream/chat/android/models/Poll;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->s(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->y:Lio/getstream/chat/android/models/Poll;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->t(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;->y:Lio/getstream/chat/android/models/Poll;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->w(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
