.class public final synthetic Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;->x:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;->x:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->a(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;->x:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->b(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
