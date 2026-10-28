.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

.field public final synthetic y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->m(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ltb/a;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->x(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
