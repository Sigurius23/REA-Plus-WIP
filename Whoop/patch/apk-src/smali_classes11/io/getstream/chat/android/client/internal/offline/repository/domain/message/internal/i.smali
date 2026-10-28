.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;->y:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->b(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Ltb/a;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->d(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Ltb/a;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
