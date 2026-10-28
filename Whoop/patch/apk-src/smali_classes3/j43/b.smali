.class public final Lj43/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/video/android/core/notifications/internal/service/CallService;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/video/android/core/notifications/internal/service/CallService;I)V
    .locals 0

    iput p2, p0, Lj43/b;->w:I

    iput-object p1, p0, Lj43/b;->x:Lio/getstream/video/android/core/notifications/internal/service/CallService;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lj43/b;->w:I

    const/4 v1, 0x0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lj43/b;->x:Lio/getstream/video/android/core/notifications/internal/service/CallService;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->I:Ll83/p;

    invoke-virtual {v3}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->b()V

    return-object v2

    :pswitch_0
    sget-object v0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->I:Ll83/p;

    invoke-virtual {v3, v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    return-object v2

    :pswitch_1
    sget-object v0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->I:Ll83/p;

    invoke-virtual {v3, v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
