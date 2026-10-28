.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

.field public final synthetic z:Ljava/util/Date;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;II)V
    .locals 0

    iput p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->x:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->z:Ljava/util/Date;

    iput p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->E:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->z:Ljava/util/Date;

    invoke-static {v1, v2, v3, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->B(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->E:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->z:Ljava/util/Date;

    invoke-static {v1, v2, v3, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->o(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->E:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->z:Ljava/util/Date;

    invoke-static {v1, v2, v3, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->s(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->E:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->x:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;->z:Ljava/util/Date;

    invoke-static {v1, v2, v3, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->f(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
