.class public final synthetic Lio/getstream/chat/android/client/clientstate/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/clientstate/UserStateService;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/clientstate/UserStateService;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/clientstate/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/clientstate/a;->x:Lio/getstream/chat/android/client/clientstate/UserStateService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/clientstate/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/chat/android/client/clientstate/UserState$NotSet;

    check-cast p2, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/a;->x:Lio/getstream/chat/android/client/clientstate/UserStateService;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/client/clientstate/UserStateService;->g(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/getstream/chat/android/client/clientstate/UserState;

    check-cast p2, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/a;->x:Lio/getstream/chat/android/client/clientstate/UserStateService;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/client/clientstate/UserStateService;->e(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/clientstate/UserState;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
