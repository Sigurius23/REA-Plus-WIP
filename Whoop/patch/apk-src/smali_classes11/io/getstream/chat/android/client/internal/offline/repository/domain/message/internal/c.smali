.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->y:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->i(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->v(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->q(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->z(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
