.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:I

.field public final synthetic z:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;I)V
    .locals 0

    iput p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->x:Ljava/lang/String;

    iput p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->y:I

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->z:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->z:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->x:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->y:I

    invoke-static {v1, v2, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->u(Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->z:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->x:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;->y:I

    invoke-static {v1, v2, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->p(Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
